package processor;

import java.io.FileReader;

public abstract class AbstractFileProcessor {

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

    public void init(){
        // ok
    }

    public abstract void process(char c);

    public void dispose(){
        // ok
    }
}
