package ru.n1kk0n.byvaluebyref;

public class Solution {
    
    public static void changeValue(int i) {
        i++;
    }

    public static void changeObject(Integer i) {
        i++;
    }

    public static void changeString(String s) {
        s += " World!";
    }
    
    public static void changeTestObject(TestObject testObject) {
        testObject.setValue(testObject.getValue() + 20);
    }

    public static void main(String[] args) {
        TestObject object = new TestObject();
        Integer I = new Integer(10);
        String s = "Hello";
        int i = 1;
        
        System.out.println("Before TestObject: " + object);
        changeTestObject(object);
        System.out.println("After TestObject: " + object);

        System.out.println("Before Integer: " + I);
        changeObject(I);
        System.out.println("After Integer: " + I);

        System.out.println("Before String: " + s);
        changeString(s);
        System.out.println("After String: " + s);
        
        System.out.println("Before int: " + i);
        changeValue(i);
        System.out.println("After int: " + i);
    }
}
