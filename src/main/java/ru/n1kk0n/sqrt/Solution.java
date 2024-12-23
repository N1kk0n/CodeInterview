package ru.n1kk0n.sqrt;

import java.util.HashMap;

public class Solution {
    public static int mySqrt(int number) {
        if (number < 0)
            return -1;
        if (number == 0 || number == 1) {
            return number;
        } else {
            int min = 0;
            int max = Integer.MAX_VALUE;
            int answer = -1;
            while (min < max) {
                long middle = (min + max) / 2;
                if (middle * middle == number)
                    return (int) middle;
                if (middle * middle < number) {
                    min = (int) middle;
                } else {
                    max = (int) middle;
                }
                if (answer == middle)
                    break;
                answer = (int) middle;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2));
        System.out.println(mySqrt(3));
        System.out.println(mySqrt(4));
        HashMap<String, String> hMap = new HashMap<>();
    }
}
