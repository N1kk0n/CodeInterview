package ru.n1kk0n.removeelement;

import java.util.ArrayList;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> savingElements = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                continue;
            savingElements.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -1;
        }
        for (int i = 0; i < savingElements.size(); i++) {
            nums[i] = savingElements.get(i);
        }
        return savingElements.size();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 1, 3 };
        System.out.println(removeElement(nums, 3));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
