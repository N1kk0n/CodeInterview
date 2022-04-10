package ru.n1kk0n.superkeyword;

public class Parent {
    private int value;
    protected static int staticValue = 10;

    public Parent() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void whoami() {
        System.out.println("Parent");
    }

    public static void whoami(String name) {
        System.out.println("Parent: " + name);
    }
}
