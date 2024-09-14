package ru.n1kk0n.ispalindromenumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }

}
