package com.lukaszszszsz.level01;


import org.javatuples.Triplet;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem009 {


    static boolean isPythagoreanTriplet(Triplet<Integer,Integer,Integer> triplet)
    {
        return triplet.getValue0()*triplet.getValue0() + triplet.getValue1() * triplet.getValue1() == triplet.getValue2() * triplet.getValue2();
    }

    static Integer tripletProduct(Triplet<Integer,Integer,Integer> triplet)
    {
        return triplet.getValue0()*triplet.getValue1()  * triplet.getValue2();
    }

    static Stream<Triplet> generateTripletsWhereSumIsGiven(Integer sum) {

        return IntStream.rangeClosed(1,sum/2)
                .boxed()
                .flatMap(numberA ->
                        IntStream.rangeClosed(numberA+1,  (sum/2))
                                .mapToObj(numberB ->
                                        Triplet.with(numberA,numberB,sum-numberA-numberB))
                );



    }


    public static void main(String[] args) {

        var results = generateTripletsWhereSumIsGiven(1000)
                .filter(Problem009::isPythagoreanTriplet)
                .map(Problem009::tripletProduct)
                .findFirst()
                .get();

        System.out.println(results);

    }

}
