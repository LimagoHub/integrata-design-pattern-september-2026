package main;


import processor.CharacterCounter;
import processor.FileCopy;
import processor.FileProcessor;
import processor.LineCounter;


public class Main {

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        processor.addCharacterHandler(new CharacterCounter());
        processor.addCharacterHandler(new LineCounter());
        processor.addCharacterHandler(new FileCopy());
        processor.run("./src/resources/eingabe.txt");
    }
}
