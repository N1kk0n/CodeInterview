package ru.n1kk0n.onerowscreen;

public class Solution {
    public static void main(String[] args) {
        final int SCREEN_LENGTH = 20;
        String content = "Based on your input, get a random alpha numeric string. The random string generator creates a series of numbers and letters that have no pattern. These can be helpful for creating security codes.";
        
        for (int i = 0; i < content.length() - SCREEN_LENGTH + 1; i++) {
            System.out.println(content.substring(i, i + SCREEN_LENGTH));
        }
    }
}
