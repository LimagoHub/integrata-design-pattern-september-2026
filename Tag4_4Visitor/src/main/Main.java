package main;

import firma.Firma;
import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;
import mitarbeiter.visitor.PrintVisitor;

public interface Main {

    public static void main(String[] args) {
        Firma firma = new Firma();

        firma.add(new GehaltsEmpfaenger("Schmitt", 1000));
        firma.add(new LohnEmpfaenger("Hinz", 20,40));
        firma.add(new LohnEmpfaenger("Kunz", 15,36));
        firma.add(new GehaltsEmpfaenger("Mayer", 2000));
        firma.add(new GehaltsEmpfaenger("Schulz", 3000));

        //firma.ausgabe();
        firma.iterate(new PrintVisitor());
    }
}
