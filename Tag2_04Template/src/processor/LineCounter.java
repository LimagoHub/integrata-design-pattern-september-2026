package processor;

public class LineCounter implements CharacterHandler {
    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void process(final char c) {
        if(c == '\n')
            counter++;
    }

    @Override
    public void dispose() {
        System.out.println(counter);
    }
}
