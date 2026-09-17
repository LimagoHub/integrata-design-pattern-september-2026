package command;

import math.Calculator;


public class ClearCommand extends AbstractTransactionCommand{


    @Override
    protected void doAction() {
        Calculator.getInstance().clear();
    }
}
