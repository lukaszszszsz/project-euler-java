package com.lukaszszszsz.level01;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Problem001 {





    static int getSumOfAllMultipliesBelow(Integer max, List<Integer> divisors){

        return IntStream.range(1, max).filter(isDivisibleByAnyOf(divisors)).sum();

    }


    private static IntPredicate isDivisibleByAnyOf(List<Integer> divisors) {
        return number -> divisors.stream().anyMatch(isDivisor(number));
    }
    private static Predicate<Integer> isDivisor(Integer number) {
        return divisor -> number % divisor == 0;
    }

    public static void main(String[] args) {
        final int N = 1000;
        int A = 3;
        int B = 5;
        final List<Integer> divisors = List.of(A,B);

        System.out.println(getSumOfAllMultipliesBelow(N,divisors));
    }


}
