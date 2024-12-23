package ru.n1kk0n.hashmaptest;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>(2);
        hMap.put(1, "one");
        System.out.println(hMap.size());
        hMap.put(2, "two");
        System.out.println(hMap.size());
    }
}
