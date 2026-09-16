package math;

public class CalculatorLogger implements Calculator{

    private final Calculator calc;

    protected CalculatorLogger(final Calculator calc) {
        this.calc = calc;
    }

    @Override
    public double add(final double a, final double b) {
        System.out.println("Adding " + a + " " + b);
        return calc.add(a, b);
    }

    @Override
    public double sub(final double a, final double b) {
        return calc.sub(a, b);
    }
}
