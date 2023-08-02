package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem007Test {




    @Test
    void test_getNthPrime () {
        var result = Problem007.getNthPrime(6);
        Integer expected = 13;

        Assertions.assertEquals(expected,result);
    }
}