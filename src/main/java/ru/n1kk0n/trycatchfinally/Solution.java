package ru.n1kk0n.trycatchfinally;

public class Solution {
    
    public void methodWithoutExit() {
        System.out.println("methodWithoutExit: ");
        try {
            System.out.println("try");
            throw new Exception("Exception");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
    
    public void methodWithExit() {
        System.out.println("methodWithExit: ");
        try {
            System.out.println("try");
            throw new Exception("Exception");
        } catch (Exception e) {
            System.out.println("catch with exit 0");
            System.exit(1);
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        
        s.methodWithExit();
        s.methodWithoutExit();
    }
}
