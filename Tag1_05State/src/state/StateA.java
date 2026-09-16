package state;

public class StateA extends AbstractState {

    public StateA(final Fassade fassade) {
        super(fassade);
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt A");
    }

    @Override
    public void changeToB() {
       getFassade().current = getFassade().stateB;
    }
}
