package state;

public class Fassade {

    /* default */ final State  stateA = new StateA(this);
    /* default */ final State  stateB = new StateB(this);
    /* default */ State  current = stateA;


    public void drucken() {
        current.drucken();
    }

    public void changeToB() {
        current.changeToB();
    }

    public void changeToA() {
        current.changeToA();
    }
}
