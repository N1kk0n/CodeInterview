package ru.n1kk0n.abstractvsinterface;

public interface Interf {
    public double PI = 3.1415;
    public default void log(String s) {
        print(s, "INFO");
    }

    private void print(String message, String lvl) {
        System.out.println(lvl + ": " + message);
    }
    public static void static_name() {
        
    }
}
