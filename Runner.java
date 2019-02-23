package Blinnov.chapter8Exception;

//import Blinnov.chapter8Exception.Connector;

public class Runner {
    public static void main(String[] args) {
        SameResource f = new SameResource(); // SameResource f = null;
        f = null;
        try {// необязателен только при гарантированной корректности значения параметра
            Connector.loadResource(f);
        } catch (IllegalArgumentException e) {
            System.err.print("обработка unchecked-исключения вне метода: " + e);
        }
    }
}