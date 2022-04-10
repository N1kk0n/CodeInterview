package ru.n1kk0n.superkeyword;

public class Sister extends Parent {
    
    public static void whoami() {
        System.out.println("Sister");
    }

    public void showAndChange() {
        System.out.println(staticValue);
        staticValue += 10;
    }
}
