package math;

public class CalculatorSecure implements Calculator {

    private final  Calculator calc;

    protected CalculatorSecure(final Calculator calc) {
        this.calc = calc;
    }

    public double add(final double a, final double b) {
        System.out.println("Du kommst hier rein!");
        return calc.add(a, b);
    }

    public double sub(final double a, final double b) {
        return calc.sub(a, b);
    }
}
