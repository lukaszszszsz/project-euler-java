package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.lukaszszszsz.level01.Problem002;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Problem002Test {


    @Test
    void test_FibonacciGenerator() {

        var results = Problem002.fibonacciStream.limit(5).toArray();

        Assertions.assertArrayEquals(new int[]{1,2,3,5,8},results);
    }
}