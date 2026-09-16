package state;

import java.io.OutputStreamWriter;

public class StateB extends AbstractState {

    public StateB(final Fassade fassade) {
        super(fassade);
    }

    @Override
    public void changeToA() {
        getFassade().current = getFassade().stateA;
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt B");
    }
}
