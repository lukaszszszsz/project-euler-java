package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class Problem006Test {




    @Test
    void test_differenceBetweenTheSumOfTheSquaresAndSquareTheSum () {
        var result = Problem006.squareOfSum(10)-Problem006.sumOfAllSquares(10);
        Integer expected = 2640;

        Assertions.assertEquals(expected,result);
    }
}