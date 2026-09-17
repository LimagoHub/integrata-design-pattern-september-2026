package command;

import math.Calculator;

import java.io.Console;

public class Print extends AbstractCommand {
    @Override
    public void execute() {
        Calculator.getInstance().print();
    }
}
