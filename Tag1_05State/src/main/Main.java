package main;

import state.Fassade;

public class Main {

    public static void main(String[] args) {
        Fassade fassade = new Fassade();
        fassade.drucken();
        fassade.changeToB();
        fassade.drucken();
        fassade.changeToB();
    }
}
