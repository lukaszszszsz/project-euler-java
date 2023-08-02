package com.lukaszszszsz.level01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Problem003 {

    public static Stream<Long> primeNumbersTill(Long n) {
        return LongStream.rangeClosed(2, n)
                .filter(x -> isPrime(x)).boxed();
    }
    private static boolean isPrime(Long number) {
        return primeNumbersTill((long) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }

    static long largestPrimeFactor(long number) {

        return getPrimeFactors(number).max(Long::compareTo).get();

    }

    static Stream<Long> getPrimeFactors(long number) {

        return primeNumbersTill(number)
                .filter( prime -> number % prime == 0L )
                .limit(1)
                .map(prime -> getPrimeFactors(number / prime).findFirst().orElse(prime));

    }

    public static void main(String[] args) {
        var results = largestPrimeFactor(600851475143L);

        System.out.println(results);

    }

}
