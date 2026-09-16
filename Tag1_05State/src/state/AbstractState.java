package state;

public abstract class AbstractState implements State {

    private final Fassade fassade;

    public AbstractState(final Fassade fassade) {
        this.fassade = fassade;
    }

    public final Fassade getFassade() {
        return fassade;
    }

    @Override
    public void drucken() {
        throw new IllegalStateException("Upps");
    }

    @Override
    public void changeToB() {
        throw new IllegalStateException("Upps");
    }

    @Override
    public void changeToA() {
        throw new IllegalStateException("Upps");
    }
}
