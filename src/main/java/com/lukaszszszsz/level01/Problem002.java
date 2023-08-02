package com.lukaszszszsz.level01;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Problem002 {

    private static class FibonacciSupplier implements IntSupplier{

        int[] values = {0,1};

        @Override
        public int getAsInt() {
            int tmp = values[1];
            values[1] += values[0];
            values[0] = tmp;

            return values[1];
        }
    }

    static IntStream fibonacciStream = IntStream.generate(new FibonacciSupplier());


    public static void main(String[] args) {
        var results = fibonacciStream.takeWhile(number -> number < 4000000).filter(number -> number % 2 == 0).sum();

        System.out.println(results);

    }

}
