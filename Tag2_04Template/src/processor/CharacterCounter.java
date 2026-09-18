package processor;

public class CharacterCounter extends AbstractCharacterCounter {


    @Override
    public void process(final char c) {
        incrementCounter();
    }


}
