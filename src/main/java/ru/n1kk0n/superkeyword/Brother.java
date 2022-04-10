package ru.n1kk0n.superkeyword;

public class Brother extends Parent {

    public static void whoami() {
        System.out.println("Brother");
    }

    public static void whoami(String name) {
        System.out.println("Brother: " + name);
    }

    public void showAndChange() {
        System.out.println(staticValue);
        staticValue += 10;
    }
}
