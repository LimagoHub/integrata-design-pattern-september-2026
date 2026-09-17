package command;

import math.Calculator;
import math.CalculatorMemento;

public abstract class AbstractTransactionCommand extends AbstractCommand{

    private CalculatorMemento memento;

    @Override
    public final void execute() {
        memento = Calculator.getInstance().getMemento();
        doAction();
    }
    protected abstract void doAction() ;

    @Override
    public final void undo() {
        Calculator.getInstance().setMemento(memento);
    }

    @Override
    public final boolean isQuery() {
        return false;
    }
}
