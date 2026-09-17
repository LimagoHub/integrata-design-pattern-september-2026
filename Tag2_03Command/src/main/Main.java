package main;

import command.Command;
import command.CommandFactory;
import command.CommandHistory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandHistory commandHistory = new CommandHistory();
        while(true) {
            System.out.print("#>");
            String zeile = scanner.nextLine();
            if (zeile.equals("ende")) break;
            if (zeile.equals("undo")) {
                commandHistory.undo();
                continue;
            }
            if (zeile.equals("redo")) {
                commandHistory.redo();
                continue;
            }

            Command command = CommandFactory.createCommand(zeile);
            if(command == null) continue;

            command.execute();
            commandHistory.addCommand(command);

        }
    }
}
