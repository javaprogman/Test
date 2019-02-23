package Blinnov.chapter8Exception;

public class Connector {
    public static void loadResource(SameResource f) {
        if (f == null) {
            throw new IllegalArgumentException(); /* генерация исключения */
// или собственное, н-р, throw new IllegalResourceException();
        }
// more code
    }
}