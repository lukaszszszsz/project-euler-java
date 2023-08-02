package com.lukaszszszsz.level01;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.reducing;

public class Problem006 {

    public static int sumOfAllSquares(Integer n) {
        return IntStream.rangeClosed(1, n)
                .map(number -> number*number)
                .sum()                ;
    }

    public static int squareOfSum(Integer n) {
        var sum = IntStream.rangeClosed(1, n)
                .sum();
        return sum*sum;
    }



    public static void main(String[] args) {
        var results = squareOfSum(100)-sumOfAllSquares(100);

        System.out.println(results);

    }

}
