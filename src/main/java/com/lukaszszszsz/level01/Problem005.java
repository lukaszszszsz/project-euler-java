package com.lukaszszszsz.level01;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.reducing;

public class Problem005 {

    public static Stream<Integer> primeNumbersTill(Integer n) {
        return IntStream.rangeClosed(2, n)
                .filter(x -> isPrime(x)).boxed();
    }

    private static boolean isPrime(Integer number) {
        return primeNumbersTill((int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }


    static Stream<Integer> getAllPrimeFactors(Integer number) {


        return  primeNumbersTill(number)
                .filter( prime -> number % prime == 0 )
                .limit(1)
//                .peek(System.out::println)
                .flatMap(prime -> Stream.concat(Stream.of(prime),getAllPrimeFactors(number / prime)));

    }

    static Map<Integer,Integer> getAllPrimeFactorsOccurenceMap(Integer number) {

        return  getAllPrimeFactors(number).collect(Collectors.groupingBy(Function.identity(), reducing(0, e -> 1, Integer::sum)));

    }


    static Integer getMinimumNumberThatCanBeDividedByAllNumbersfFrom1ToLimit(Integer limit) {

        return  IntStream.rangeClosed(2,limit).mapToObj(number -> getAllPrimeFactorsOccurenceMap(number))
                .flatMap(mapOfPrimes -> mapOfPrimes.entrySet().stream())
                .collect(Collectors.groupingBy(entry -> entry.getKey(), reducing(0, e -> e.getValue(), Integer::max)))
                .entrySet().stream()
                .peek(System.out::println)
                .mapToInt(entry ->  (int) Math.pow(entry.getKey(),entry.getValue()))
                .reduce(1, (current, accumulated) -> current * accumulated);


    }

    public static void main(String[] args) {
        var results = getMinimumNumberThatCanBeDividedByAllNumbersfFrom1ToLimit(20);

        System.out.println(results);

    }

}
