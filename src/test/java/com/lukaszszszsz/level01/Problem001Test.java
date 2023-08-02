package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.lukaszszszsz.level01.Problem001;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem001Test {

    @Test
    void givenDivisorsAndLimit_whenGetSumOfAllMultipliesBelow_returnCorrectSum() {
        final int N = 10;
        int A = 3;
        int B = 5;
        final List<Integer> divisors = List.of(A,B);

        int result = Problem001.getSumOfAllMultipliesBelow(N,divisors);

        Assertions.assertEquals(23,result);
    }
}