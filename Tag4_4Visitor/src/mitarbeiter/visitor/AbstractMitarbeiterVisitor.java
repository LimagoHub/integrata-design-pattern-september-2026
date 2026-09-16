package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {

    protected AbstractMitarbeiterVisitor() {
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        // Ok
    }

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        // ok
    }

    @Override
    public void init() {
        // ok
    }

    @Override
    public void dispose() {
        // ok
    }
}
