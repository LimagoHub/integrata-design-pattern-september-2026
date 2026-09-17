package processor;

public class CharacterCounter implements CharacterHandler {

    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void process(final char c) {
        counter++;
    }

    @Override
    public void dispose() {
        System.out.println(counter);
    }
}
