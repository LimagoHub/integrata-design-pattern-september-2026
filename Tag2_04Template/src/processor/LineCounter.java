package processor;

public class LineCounter extends AbstractCharacterCounter {

    @Override
    public void process(final char c) {
        if(c == '\n')
            incrementCounter();
    }
}
