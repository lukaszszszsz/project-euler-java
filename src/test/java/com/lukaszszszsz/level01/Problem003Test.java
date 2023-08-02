package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem003Test {


    @Test
    void test_largestPrimeFactor() {

        var result = Problem003.largestPrimeFactor(13195L);

        Assertions.assertEquals(29L,result);
    }
}