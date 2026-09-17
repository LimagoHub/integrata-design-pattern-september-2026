package command;

import math.Calculator;

public class ClearCommand extends AbstractCommand{
    private double oldVaue;

    @Override
    public void execute() {
        this.oldVaue = Calculator.getInstance().getMemory();
        Calculator.getInstance().clear();
    }

    @Override
    public void undo() {
       Calculator.getInstance().setMemory(oldVaue);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
