package ru.n1kk0n.enums;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public enum DayOfWeek {
        SUNDAY {
            @Override
            public String toString() {
                return super.toString();
            }
        }, MONDAY {
            @Override
            public String toString() {
                return super.toString();
            }
        }, TUESDAY {
            @Override
            public String toString() {
                return super.toString();
            }
        }, WEDNESDAY {
            @Override
            public String toString() {
                return super.toString();
            }
        }, THURSDAY {
            @Override
            public String toString() {
                return super.toString();
            }
        }, FRIDAY {
            @Override
            public String toString() {
                return super.toString();
            }
        }, SATURDAY {
            @Override
            public String toString() {
                return super.toString();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(DayOfWeek.SATURDAY);
        System.out.println(Arrays.stream(DayOfWeek.values()).distinct().collect(Collectors.toList()));
        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value);
        }
    }
}
