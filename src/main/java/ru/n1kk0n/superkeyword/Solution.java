package ru.n1kk0n.superkeyword;

public class Solution {
    public static void main(String[] args) {
        Brother brother = new Brother();
        Sister sister = new Sister();
        Brother.whoami();
        Sister.whoami();
        brother.showAndChange();
        sister.showAndChange();
        Parent parent = new Parent();
        System.out.println("Parent (static): " + Parent.staticValue);
        System.out.println("Parent: " + parent.getValue());
    }
}
