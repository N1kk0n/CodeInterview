package ru.n1kk0n.abstractvsinterface;

public interface Interf {
    public double PI = 3.1415;

    default void log(String s) {
        // print(s, "INFO");
        System.out.println(s);
    }

    // JAVA 9 - Ok
    // private void print(String message, String lvl) {
    //     System.out.println(lvl + ": " + message);
    // }
}
