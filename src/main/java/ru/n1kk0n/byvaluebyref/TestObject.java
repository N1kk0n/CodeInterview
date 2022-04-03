package ru.n1kk0n.byvaluebyref;

/**
 * TestObject
 */
public class TestObject {

    private int value;

    TestObject() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestObject [value=" + value + "]";
    }
}