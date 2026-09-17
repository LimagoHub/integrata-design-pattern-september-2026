package processor;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    private List<CharacterHandler> handlers = new ArrayList<CharacterHandler>();

    public void addCharacterHandler(CharacterHandler handler) {
        handlers.add(handler);
    }

    public void removeCharacterHandler(CharacterHandler handler) {
        handlers.remove(handler);
    }

    public final void run(String filename) {
        try(FileReader fileReader = new FileReader(filename)){
            init();
            int c;
            while ((c = fileReader.read()) != -1){
               process((char) c);
            }
            dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void init(){
        handlers.forEach(CharacterHandler::init);
    }

    private  void process(final char c){
        handlers.forEach(h->h.process(c));
    }

    private void dispose(){
        handlers.forEach(CharacterHandler::dispose);
    }
}
