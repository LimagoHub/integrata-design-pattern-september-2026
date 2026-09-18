package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

import java.util.List;

public interface MitarbeiterVisitor {


    void init();
    void dispose();
    void visit(GehaltsEmpfaenger gehaltsEmpfaenger);
    void visit(LohnEmpfaenger lohnEmpfaenger);
}
