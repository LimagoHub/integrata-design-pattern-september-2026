package processor;

public abstract  class AbstractCharacterCounter implements CharacterHandler{

    private int counter;


    @Override
    public final void init() {
        counter = 0;
    }



    @Override
    public final void dispose() {
        System.out.println(getClass().getSimpleName() + ": " + counter);
    }

    protected void incrementCounter() {
        counter++;
    }
}
