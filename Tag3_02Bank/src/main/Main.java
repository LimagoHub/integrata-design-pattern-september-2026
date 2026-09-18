package main;

import composite.AbstractKontenNode;
import composite.Konto;
import composite.Kontogruppe;

public class Main {

    public static void main(String[] args) {
        Kontogruppe root = new Kontogruppe("root");

        Kontogruppe e1_1 = new Kontogruppe("e1_1");
        root.appendChild(e1_1);

        Kontogruppe e1_2 = new Kontogruppe("e1_2");
        root.appendChild(e1_2);

        Kontogruppe e2_1 = new Kontogruppe("e2_1");
        e1_1.appendChild(e2_1);

        // Konto statt zusaetzlich saldo
        Konto e2_2 = new Konto("e2_2");
        e1_1.appendChild(e2_2);


        Konto e2_3 = new Konto("e2_3");
        e1_2.appendChild(e2_3);
        Konto e2_4 = new Konto("e2_4");
        e1_2.appendChild(e2_4);

        root.forEach(System.out::println);

        //traverse(root);
    }

    /*private static void traverse(AbstractKontenNode abstractKontenNode) {
        System.out.println(abstractKontenNode.toString());
        for(AbstractKontenNode child: abstractKontenNode.getChildren()){
            traverse(child);
        }

    }*/
}
