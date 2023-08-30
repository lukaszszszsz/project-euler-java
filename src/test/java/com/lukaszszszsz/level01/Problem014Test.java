package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;


class Problem014Test {

    @Test
    void test_CollatzSequence() {

        var sequenceRes = Problem014.collatzSequence(13).boxed().collect(Collectors.toList());
        System.out.println(sequenceRes);
        Assertions.assertEquals(List.of(13L,40L,20L,10L,5L,16L,8L,4L,2L,1L),sequenceRes);

    }


    @Test
    void test_LongestCollatzSequence() {


        var sequenceRes = Problem014.longestCollatzSequence(13);
        System.out.println(sequenceRes);
        Assertions.assertEquals(9,sequenceRes);

    }





}