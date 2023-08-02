package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;

class Problem005Test {


    @Test
    void test_getAllPrimeFactors() {

        var result = Problem005.getAllPrimeFactors(20).toArray();
        Integer[] expected = {2,2,5};
        Assertions.assertArrayEquals(expected,result);
    }


    @Test
    void test_getAllPrimeFactorsMap() {
        var result = Problem005.getAllPrimeFactorsOccurenceMap(20);
        Map<Integer,Integer> expected = Map.of(2,2,5,1);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void test_getMinimumNumberThatCanBeDividedByAllNumbersfFrom1ToLimit() {
        var result = Problem005.getMinimumNumberThatCanBeDividedByAllNumbersfFrom1ToLimit(10);
        Integer expected = 2520;

        Assertions.assertEquals(expected,result);
    }
}