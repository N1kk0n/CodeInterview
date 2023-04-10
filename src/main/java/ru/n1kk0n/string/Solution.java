package ru.n1kk0n.string;

public class Solution {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        byte[] ar1 = {0, 1, 2};
        byte ar2[] = {0, 1, 2};
        System.out.println("======");
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i] == ar2[i]);
        }

        ar1 = s1.getBytes();
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + " ");
        }
        System.out.println("");

        String st1 = "123";
        String st2 = new String("123");
        System.out.println("======Before Interning======");
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
        System.out.println("======After Interning======");
        st2 = st2.intern();
        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

        StringBuffer stringBuffer = new StringBuffer("111");
        StringBuilder stringBuilder = new StringBuilder("111");

    }
}
