package ru.n1kk0n.removedublicatesortedarray;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        SortedSet<Integer> uniqueElements = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!uniqueElements.contains(nums[i])) {
                uniqueElements.add(nums[i]);
            }
        }
        Iterator<Integer> i = uniqueElements.iterator();
        int index = 0;
        while (i.hasNext()) {
            nums[index] = i.next();
            index++;
        }
        return uniqueElements.size();
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

    }
}
