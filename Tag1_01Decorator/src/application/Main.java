package application;

import client.CalcClient;
import math.*;

public class Main {

    public static void main(String[] args) {


        Calculator calc = CalculatorFactory.builder()
                .withLogger()
                .withSecure()
                .build();

        CalcClient calcClient = new CalcClient(calc);
        calcClient.go();
    }
}
