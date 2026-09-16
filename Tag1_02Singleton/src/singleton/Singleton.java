package singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance() {

        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
