package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem008Test {




    @Test
    void test_adjacentDigits () {
        var result = Problem008.adjacentDigits(6).skip(1).findFirst().get();
        String expected = "316717";

        Assertions.assertEquals(expected,result);
    }


    @Test
    void test_adjacentDigitsWithMaxProduct () {
        var result = Problem008.adjacentDigitsWithMaxProduct(4);
        String expected = "9989";

        Assertions.assertEquals(expected,result);
    }

    @Test
    void test_productOfAllDigitsInSubstring () {
        var result = Problem008.productOfAllDigitsInSubstring("9989");
        Long expected = 5832L;

        Assertions.assertEquals(expected,result);
    }
}