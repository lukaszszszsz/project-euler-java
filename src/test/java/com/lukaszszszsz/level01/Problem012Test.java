package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;


class Problem012Test {

    @Test
    void test_triangleNumbers() {

        var res = Problem012.triangleNumbers().limit(5).boxed().collect(Collectors.toList());
        Assertions.assertEquals( List.of(1,3,6,10,15),res);



    }

    @Test
    void test_getDivisors() {
        var res = Problem012.getDivisors(28).boxed().collect(Collectors.toList());
        Assertions.assertEquals( List.of(1,2,4,7,14,28),res);

    }


    @Test
    void test_getFirstTriangleNumberThatMatches() {

        var res = Problem012.getFirstTriangleNumberThatMatches(number -> Problem012.getDivisors(number).count() > 5);
        Assertions.assertEquals( 28,res);

    }


}