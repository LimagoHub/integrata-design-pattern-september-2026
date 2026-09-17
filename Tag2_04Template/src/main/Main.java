package main;

import processor.AbstractFileProcessor;
import processor.CharacterCounter;
import processor.LineCounter;


public class Main {

    public static void main(String[] args) {
        AbstractFileProcessor processor = new LineCounter();
        processor.run("./src/resources/eingabe.txt");
    }
}
