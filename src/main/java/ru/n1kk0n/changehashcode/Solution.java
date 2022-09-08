package ru.n1kk0n.changehashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        class HashObject {
            private int value;

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            @Override
            public String toString() {
                return "HashObject{" +
                        "value=" + value +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                HashObject that = (HashObject) o;
                return value == that.value;
            }

            @Override
            public int hashCode() {
                return Objects.hash(value);
            }
        }
        HashObject firstMapValue = new HashObject();
        firstMapValue.setValue(1);

        HashObject secondMapValue = new HashObject();
        secondMapValue.setValue(2);

        HashMap<HashObject, Integer> map = new HashMap<>();
        map.put(firstMapValue, 1);
        map.put(secondMapValue, 2);

        System.out.println("1: Before:");
        for (Object o: map.keySet().toArray()) {
            System.out.println(o + " " + map.get(o) + " " + o.hashCode());
        }

        firstMapValue.setValue(3);
        map.remove(firstMapValue);

        System.out.println("1: After:");
        System.out.println(map.containsKey(firstMapValue));
        for (Object o: map.keySet().toArray()) {
            System.out.println(o + " " + map.get(o) + " " + o.hashCode());
        }

        HashObject firstSetValue = new HashObject();
        firstSetValue.setValue(1);

        HashObject secondSetValue = new HashObject();
        secondSetValue.setValue(2);

        HashSet<HashObject> set = new HashSet<>();
        set.add(firstMapValue);
        set.add(secondMapValue);

        System.out.println("2: Before:");
        for (Object o: set.toArray()) {
            System.out.println(o);
        }

        firstSetValue.setValue(2);

        System.out.println("2: After:");
        for (Object o: set.toArray()) {
            System.out.println(o);
        }
    }
}
