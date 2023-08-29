package com.lukaszszszsz.level01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class Problem013Test {

    @Test
    void test_VeryLongNumberContructor() {

        var veryLongNumber = new Problem013.VeryLongNumber("12345");
        Assertions.assertEquals(List.of(5,4,3,2,1),veryLongNumber.getNumber());
        Assertions.assertEquals(5,veryLongNumber.getNumber().get(0));

    }


    @Test
    void test_VeryLongNumberSum() {

        var veryLongNumber1 = new Problem013.VeryLongNumber("12345");
        var veryLongNumber2 = new Problem013.VeryLongNumber("62");
        var res1 = veryLongNumber1.sum(veryLongNumber2);
        var res2 = veryLongNumber2.sum(veryLongNumber1);
        var res3 = veryLongNumber2.sum(veryLongNumber2);
        Assertions.assertEquals(new Problem013.VeryLongNumber("12407"),res1);
        Assertions.assertEquals(new Problem013.VeryLongNumber("12407"),res2);
        Assertions.assertEquals(new Problem013.VeryLongNumber("124"),res3);

    }



}