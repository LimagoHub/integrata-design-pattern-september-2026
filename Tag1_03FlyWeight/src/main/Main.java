package main;

import flyweight.AttributedCharacter;

public class Main {

    public static void main(String[] args) {
        AttributedCharacter a1 = AttributedCharacter.getInstance   ('A', true);
        AttributedCharacter a2 = AttributedCharacter.getInstance   ('A', true);
        AttributedCharacter a3 = AttributedCharacter.getInstance   ('A', false);

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
    }
}
