package com.lukaszszszsz.level01;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem007 {

    public static Stream<Integer> primeNumbers() {
        return primeNumbers(Integer.MAX_VALUE);
    }

    public static Stream<Integer> primeNumbers(int maxNumber) {
        return IntStream.rangeClosed(2, maxNumber)
                .filter(x -> isPrime(x)).boxed();
    }

    private static boolean isPrime(Integer number) {
        return primeNumbers((int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }

    static Integer getNthPrime(Integer number) {
        return primeNumbers().skip(number-1).findFirst().get();
    }



    public static void main(String[] args) {
//        var results = primeNumbers(Integer.MAX_VALUE).findFirst().get();
        var results = getNthPrime(10001);

        System.out.println(results);

    }

}
