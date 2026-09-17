package command;

public class CommandFactory {

    public static Command createCommand(String zeile) {
        Command command = null;
        String [] tokens = zeile.split(" ");

        switch (tokens[0]) {
            case "Add" -> {
                command = new AddCommand();
                command.parse(tokens);
            }
            case "Print" -> {
                command = new Print();
                command.parse(tokens);
            }
            default -> System.out.println("Invalid command");
        }


        return command;
    }
}
