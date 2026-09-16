package application;

import client.CalcClient;
import math.*;

public class Main {

    public static void main(String[] args) {


        CalculatorFactory.setLogger(true);
        Calculator calc = CalculatorFactory.createCalculator();

        CalcClient calcClient = new CalcClient(calc);
        calcClient.go();
    }
}
