package com.lukaszszszsz.level01;

import org.javatuples.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Problem014 {


    public static LongStream collatzSequence(Integer init) {
        return LongStream.concat(
                LongStream.iterate(init,number -> number > 1 && number < Long.MAX_VALUE/3, number -> number%2 ==0 ? number/2 : 3*number+1),
                LongStream.of(1));
    }

    public static Integer longestCollatzSequence(Integer maxNumber) {
        return IntStream.rangeClosed(1,maxNumber)
                .mapToObj(number -> Pair.with(number,collatzSequence(number).count()))
                .peek(System.out::println)
                .max(Comparator.comparingLong(Pair::getValue1))
                .get()
                .getValue0();
    }

    public static void main(String[] args) {
        var sequenceRes = Problem014.longestCollatzSequence(1000000);
        System.out.println(sequenceRes);
    }
}
