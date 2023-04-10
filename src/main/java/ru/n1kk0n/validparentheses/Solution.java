package ru.n1kk0n.validparentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        char[] input = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ']' || input[i] == '}' || input[i] == ')') {
                if (stack.isEmpty())
                    return false;
                else {
                    char c = stack.pop();
                    if (input[i] - c <= 0 || input[i] - c > 2) {
                        return false;
                    }
                }
            } else {
                stack.push(input[i]);
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("[]"));
        System.out.println(solution.isValid("()[]{}"));
    }
}
