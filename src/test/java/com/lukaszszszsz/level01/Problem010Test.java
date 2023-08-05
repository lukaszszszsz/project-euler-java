package com.lukaszszszsz.level01;

import org.javatuples.Triplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;


class Problem010Test {


    @Test
    void test_getSumOfPrimesBelow() {
        Assertions.assertEquals(17L,Problem010.getSumOfPrimesBelow(10));
    }


}