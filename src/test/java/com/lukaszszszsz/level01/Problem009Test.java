package com.lukaszszszsz.level01;

import org.javatuples.Triplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;


class Problem009Test {

    @Test
    void isPythagoreanTriplet() {
        Assertions.assertTrue(Problem009.isPythagoreanTriplet(Triplet.with(3,4,5)));
        Assertions.assertFalse(Problem009.isPythagoreanTriplet(Triplet.with(3,1,2)));


    }

    @Test
    void tripletProduct() {
        Assertions.assertEquals(60,Problem009.tripletProduct(Triplet.with(3,4,5)));
    }

    @Test
    void generateTripletsWhereSumIsGiven() {
        Assertions.assertTrue(Problem009.generateTripletsWhereSumIsGiven(12).collect(Collectors.toList()).contains(Triplet.with(3,4,5)));

    }
}