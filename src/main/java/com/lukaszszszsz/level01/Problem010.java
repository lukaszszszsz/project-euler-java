package com.lukaszszszsz.level01;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem010 {


    public static Stream<Integer> primeNumbers(int maxNumber) {
        return IntStream.rangeClosed(2, maxNumber)
                .filter(x -> isPrime(x)).boxed();
    }

    private static boolean isPrime(Integer number) {
        return primeNumbers((int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }

    static Long getSumOfPrimesBelow(Integer maxNumber) {
        return primeNumbers(maxNumber)
                .mapToLong(Integer::longValue).sum();
    }



    public static void main(String[] args) {
//        var results = primeNumbers(Integer.MAX_VALUE).findFirst().get();
        var results = getSumOfPrimesBelow(2000000);

        System.out.println(results);

    }

}
