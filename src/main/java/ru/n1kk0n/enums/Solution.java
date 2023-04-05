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

    public enum EmptyEnum {}

    public enum Response {
        OK(200, "Success"), NOT_FOUND(404, "Data not found");
        private int code;
        private String description;

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        private Response(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public String toString() {
            return super.toString() + ", code: " + this.code + ", description: " + this.description;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.stream(DayOfWeek.values()).distinct().collect(Collectors.toList()));
        System.out.println(Arrays.stream(EmptyEnum.values()).distinct().collect(Collectors.toList()));
        System.out.println(Arrays.stream(Response.values()).distinct().collect(Collectors.toList()));
    }
}
