package com.hackerrank;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerformOperationTest {


    @Test
    @DisplayName("isOdd")
    void testIsOdd() {
        assertFalse(PerformOperation.isOdd(4), "EVEN"); // even
        assertTrue(PerformOperation.isOdd(3), "ODD"); // odd

    }

    @Test
    @DisplayName("isPrime")
    void testIsPrime() {
        assertTrue(PerformOperation.isPrime(5), "PRIME"); // prime
        assertTrue(PerformOperation.isPrime(1033), "PRIME"); // prime
        assertTrue(PerformOperation.isPrime(9973), "PRIME"); // prime
        assertTrue(PerformOperation.isPrime(479001599), "PRIME"); // prime
        assertFalse(PerformOperation.isPrime(12), "COMPOSITE"); // composite
        assertFalse(PerformOperation.isPrime(564564556), "COMPOSITE"); // composite
    }

    @Test
    @DisplayName("isPalindrome")
    void testIsPalindrome() {
        assertTrue(PerformOperation.isPalindrome(898), "PALINDROME"); // palindrome
        assertTrue(PerformOperation.isPalindrome(1223221), "PALINDROME"); // palindrome
        assertFalse(PerformOperation.isPalindrome(1235), " NOT PALINDROME"); // not palindrome
        assertFalse(PerformOperation.isPalindrome(564565402), " NOT PALINDROME"); // not palindrome

    }
}