package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public class LohnEmpfaenger extends AbstractMitarbeiter{

    private double stundenlohn;
    private double arbeitszeit;

    public LohnEmpfaenger(final String name, final double stundenlohn, final double arbeitszeit) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.arbeitszeit = arbeitszeit;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(final double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

    public void setArbeitszeit(final double arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stundenlohn = " + stundenlohn + ", Arbeitszeit = " + arbeitszeit;
    }

    @Override
    public void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
