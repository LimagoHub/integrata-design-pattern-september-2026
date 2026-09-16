package main;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var liste = List.of("Eins", "zwei", "drei", "vier");

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        for (var item: liste) {
            System.out.println(item);
        }

        liste.forEach(System.out::println);

        var iterator = liste.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.forEachRemaining(System.out::println);
    }
}
