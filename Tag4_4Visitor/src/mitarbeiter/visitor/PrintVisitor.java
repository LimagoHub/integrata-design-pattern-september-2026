package mitarbeiter.visitor;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class PrintVisitor extends AbstractMitarbeiterVisitor {
    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        printMitarbeiter(gehaltsEmpfaenger);
    }

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        printMitarbeiter(lohnEmpfaenger);
    }

    private void printMitarbeiter(AbstractMitarbeiter mitarbeiter) {
        System.out.println(mitarbeiter);
    }
}
