package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public class GehaltsEmpfaenger extends AbstractMitarbeiter{

    private double gehalt;


    public GehaltsEmpfaenger(final String name) {

        super(name);
    }

    public GehaltsEmpfaenger(final String name, final double gehalt) {
        super(name);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(final double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gehalt = " + gehalt;
    }

    @Override
    public void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
