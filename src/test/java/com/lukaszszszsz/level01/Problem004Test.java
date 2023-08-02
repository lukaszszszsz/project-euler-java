package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem004Test {


    @Test
    void test_isPalindrome() {

        Assertions.assertTrue(Problem004.isPalindrome(2002));
        Assertions.assertTrue(Problem004.isPalindrome(20102));
        Assertions.assertFalse(Problem004.isPalindrome(2122));
    }

    @Test
    void test_largestPalindromeAsProduct() {
        Assertions.assertEquals(9009,Problem004.largestPalindromeAsProduct(2));
    }

    @Test
    void test_getIntStreamHavingExactNumberOfDigits() {
        Assertions.assertEquals(10,Problem004.getIntStreamHavingExactNumberOfDigits(2).min().getAsInt());
        Assertions.assertEquals(99,Problem004.getIntStreamHavingExactNumberOfDigits(2).max().getAsInt());
    }
}