package com.lukaszszszsz.level01;

import java.util.stream.IntStream;

public class Problem004 {


    static boolean isPalindrome(Integer number) {
        String numberString = number.toString();
        int noOfChars = number.toString().length();

        return IntStream.rangeClosed(0,(int) (noOfChars-1)/2)
                .allMatch(index -> numberString.charAt(index)==numberString.charAt(noOfChars-index-1));
    }

    static IntStream getIntStreamHavingExactNumberOfDigits(int numberOfDigits){
        return IntStream.range((int) Math.pow(10L,numberOfDigits-1),(int) Math.pow(10L,numberOfDigits));
    }

    static int largestPalindromeAsProduct(int numberOfDigits) {

        return getIntStreamHavingExactNumberOfDigits(numberOfDigits)
                .flatMap(number -> getIntStreamHavingExactNumberOfDigits(numberOfDigits).map(number1 -> number1 * number))
                .filter(Problem004::isPalindrome)
                .max()
                .getAsInt();
    }



    public static void main(String[] args) {

var results = largestPalindromeAsProduct(3);
        System.out.println(results);
    }

}
