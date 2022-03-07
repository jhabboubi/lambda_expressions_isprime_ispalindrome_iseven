package com.hackerrank;

public class PerformOperation {
    private PerformOperation() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= StrictMath.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(num));
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

}
