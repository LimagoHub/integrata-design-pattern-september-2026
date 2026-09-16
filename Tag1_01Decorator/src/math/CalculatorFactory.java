package math;

import client.CalcClient;

public class CalculatorFactory {

    private static boolean logger = false;
    private static boolean secure = false;

    public static boolean isLogger() {
        return logger;
    }

    public static void setLogger(final boolean logger) {
        CalculatorFactory.logger = logger;
    }

    public static boolean isSecure() {
        return secure;
    }

    public static void setSecure(final boolean secure) {
        CalculatorFactory.secure = secure;
    }

    public static Calculator createCalculator() {
        Calculator result =  new CalculatorImpl();
        if(logger) {
            result = new CalculatorLogger(result);
        }
        if(secure) {
            result = new CalculatorSecure(result);
        }
        return result;
    }
}
