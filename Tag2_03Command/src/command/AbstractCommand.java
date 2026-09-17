package command;

public abstract class AbstractCommand implements Command {
    @Override
    public void parse(final String[] tokens) {
        //ok
    }



    @Override
    public void undo() {
        throw new IllegalCallerException("Diese aktion ist nicht möglich");
    }

    @Override
    public boolean isQuery() {
        return true;
    }
}
