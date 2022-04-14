package ru.n1kk0n.staticinterface;

public interface SolutionInterface {
    static void hello() {
        System.out.println("Hello");
    }

    void hello(String name);
}
