package creator;

import java.util.Scanner;



public class BeanCreator {
    private static final String PREFIX = "set";

    public Object createAndFillBean(String fullQualifiedClassName){



        try(Scanner scanner = new Scanner(System.in)) {
            Object result = Class.forName(fullQualifiedClassName).getConstructor().newInstance();

            for(var method : result.getClass().getDeclaredMethods()){
                if(method.getName().startsWith(PREFIX)){
                    System.out.printf("Bitte Wert fuer %s eingeben: ", method.getName().substring(PREFIX.length()));
                    method.invoke(result, scanner.nextLine());
                }
            }

            return result;
        } catch (Exception e) {
            return null;
        }
    }
}
