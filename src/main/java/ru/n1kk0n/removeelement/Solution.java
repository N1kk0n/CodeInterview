package ru.n1kk0n.removeelement;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int valCount = 0;
        int head = 0, tail = nums.length - 1, temp;
        while (head < tail) {
            if (nums[head] == val) {
                while (nums[tail] == val && head < tail) {
                    tail--;
                }
                temp = nums[head];
                nums[head] = nums[tail];
                nums[tail] = temp;
                tail--;
            } else
                head++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                valCount++;
        }
        return valCount;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 1, 3 };
        System.out.println(removeElement(nums, 3));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
