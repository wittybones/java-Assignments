package com.step.assignments;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(10,13,20));
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number) {
        if (number < 13 || number > 19) {
            return false;
        }
        return true;
    }

}
