package ru.n1kk0n.staticinterface;

public class Solution implements SolutionInterface {

    @Override
    public void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.hello("World");
        SolutionInterface.hello();
    }
    
}
