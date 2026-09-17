package math;

public class Calculator {

    private static Calculator instance = new Calculator();

    private Calculator() {
        memory = 0.0;
    }

    public static Calculator getInstance() {
        return instance;
    }

    private double memory;

    public double getMemory() {
        return memory;
    }

    private void setMemory(final double memory) {
        this.memory = memory;
    }

    public void add(final double a) {
        memory += a;
    }
    public void sub(final double a) {
        memory -= a;
    }
    public void mult(final double a) {
        memory *= a;
    }
    public void div(final double a) {
        memory /= a;
    }

    public void clear() {
        memory = 0;
    }

    public void print() {
        System.out.println(memory);
    }

    public CalculatorMemento getMemento() {
        return new MyCalculatorMemento(memory);
    }

    public void setMemento(final CalculatorMemento memento) {
        setMemory(((MyCalculatorMemento) memento).getMemory());
    }

    private static class MyCalculatorMemento implements CalculatorMemento {
        private final double memory;

        public MyCalculatorMemento(final double memory) {
            this.memory = memory;
        }

        public double getMemory() {
            return memory;
        }
    }

}
