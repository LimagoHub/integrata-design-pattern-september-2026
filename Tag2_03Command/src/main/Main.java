package main;

import command.Command;
import command.CommandFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("#>");
            String zeile = scanner.nextLine();
            if (zeile.equals("ende")) break;

            Command command = CommandFactory.createCommand(zeile);
            if(command == null) continue;

            command.execute();

        }
    }
}
