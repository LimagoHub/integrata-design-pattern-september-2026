package main;

import de.integrata.tiere.Schwein;
import de.integrata.tiere.SchweineMemento;

public class Main {

    public static void main(String[] args) {
        Schwein piggy = new Schwein("Miss Piggy");
        System.out.println(piggy);

        // Zustand speichern
        SchweineMemento memento = piggy.getMemento();


        piggy.fuettern();



        System.out.println(piggy);

        // Zustand wiederherstellen
        piggy.setMemento(memento);

        System.out.println(piggy);

    }
}
