package math;

import shared.LoggerProxy;

public class CalculatorFactory {

    private boolean logger = false;
    private boolean secure = false;

    public static CalculatorFactory builder() {
        return new CalculatorFactory();
    }

    public CalculatorFactory withLogger() {
        this.logger = true;
        return this;
    }

    public CalculatorFactory withSecure() {
        this.secure = true;
        return this;
    }

    public Calculator build() {
        Calculator result = new CalculatorImpl();
        if (logger) {
            //result = new CalculatorLogger(result);
            result = (Calculator) LoggerProxy.newInstance(result);
        }
        if (secure) {
            result = new CalculatorSecure(result);
        }
        return result;
    }
}
