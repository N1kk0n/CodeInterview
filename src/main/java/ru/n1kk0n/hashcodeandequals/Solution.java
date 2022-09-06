package ru.n1kk0n.hashcodeandequals;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println("DB".hashCode());
        System.out.println("Ca".hashCode());

        Point a = new Point(3, 4);
        ColoredPoint colored_a = new ColoredPoint(3, 4, "red");

        System.out.println("Object " + a.toString() + " equals to object " + colored_a.toString() + ":" + a.equals(colored_a));
        System.out.println("Object " + colored_a.toString() + " equals to object " + a.toString() + ":" + colored_a.equals(a));
        System.out.println("a hash: " + a.hashCode());
        System.out.println("colored_a hash: " + colored_a.hashCode());

        HashSet<Object> set = new HashSet<>();
        System.out.println("Object a contains in set: " + set.contains(a));
        set.add(a);
        System.out.println("Object colored_a contains in set: " + set.contains(colored_a));
        set.add(colored_a);

        System.out.println("HashSet content: ");
        for (Object o : set.toArray()) {
            System.out.println(o.toString());
        }
    }
}
