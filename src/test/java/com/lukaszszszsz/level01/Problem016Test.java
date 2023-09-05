package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;


class Problem016Test {

    @Test
    void test_multiply() {

        var veryLongNumber = new Problem016.VeryLongNumber("51234");
        Assertions.assertEquals("51234",veryLongNumber.toString());
        Assertions.assertEquals("102468",veryLongNumber.multiply(2).toString());

    }


    @Test
    void test_getPowerOf2() {

        Assertions.assertEquals("32768",Problem016.getPowerOfTwo(15).toString());
        Assertions.assertEquals("2", Problem016.getPowerOfTwo(1).toString());

    }


    @Test
    void test_getSumOfDigits() {

        Assertions.assertEquals(26,Problem016.getPowerOfTwo(15).getSumOfDigits());

    }




}