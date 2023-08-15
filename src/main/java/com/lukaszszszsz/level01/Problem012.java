package com.lukaszszszsz.level01;

import org.javatuples.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class Problem012 {




    public static IntStream triangleNumbers(){
        return Stream.iterate(new int[] {1,1},
                        f-> {
                            int index = f[1] + 1;
                            int value = f[0] + index;
                            return new int[]{value, index};
                        })
                .mapToInt( f -> f[0]);
    }



    static protected IntStream getDivisors(Integer number) {

            return IntStream.rangeClosed(1,number)
                    .filter(curr -> number % curr == 0);

        }


    static protected Integer getFirstTriangleNumberThatMatches(Predicate<Integer> predicate) {

        return triangleNumbers()
                .boxed()
                .filter(predicate)
                .findFirst()
                .get();

    }







    public static void main(String[] args) {

        var res = getFirstTriangleNumberThatMatches(number -> {
            var divisorCount = getDivisors(number).count();
            System.out.println("number " + number +" divisors:"+ divisorCount);
                    return divisorCount> 500L;
        });
        System.out.println(res);

    }


}
