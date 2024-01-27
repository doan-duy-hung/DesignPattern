package no_6_Singleton;

public class Singleton {
    private static Singleton instance;

    private String s;

    private Singleton() {
        s = "Hello";
    }

    public static Singleton getInstance() {
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getS() {
        return s;
    }
}
