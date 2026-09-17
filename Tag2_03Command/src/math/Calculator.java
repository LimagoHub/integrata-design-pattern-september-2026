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

    public void setMemory(final double memory) {
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

}
