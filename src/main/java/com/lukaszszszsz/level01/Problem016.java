package com.lukaszszszsz.level01;

import org.javatuples.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Problem016 {




    public static VeryLongNumber getPowerOfTwo(Integer number){

        var res = new VeryLongNumber("2");

        for (int index = 2; index <= number; index ++){

            res = res.multiply(2);

        }

        return res;
    }

    static class VeryLongNumber{

        private final List<Integer> number;


        public VeryLongNumber(String number){

            this.number = number.chars()
                    .mapToObj(Character::getNumericValue)
                    .collect(Collectors.toList());
            Collections.reverse(this.number);

        }




        public VeryLongNumber(List<Integer> number){

            this.number = number;

        }

        public Integer getDigitOrDefault(int index){
            return index <= this.number.size() - 1 ? this.number.get(index) : 0;
        }


        public Integer getSumOfDigits(){
            return this.number.stream().reduce(0, (curr, sum) -> sum+curr);
        }

        public VeryLongNumber multiply(int amount){

            VeryLongNumber result = this;

            for (int index =2; index <= amount; index++){
                result=result.sum(this);
            }

            return result;
        }

        public VeryLongNumber sum(VeryLongNumber anotherNumber){

            var maxSize = Math.max(this.number.size(),anotherNumber.getNumber().size());
            int prev_leading_number = 0;
            List<Integer> result = new ArrayList<>();
            for (int index = 0; index< maxSize; index++){
                int curr = this.getDigitOrDefault(index) + anotherNumber.getDigitOrDefault(index) + prev_leading_number;
                int curr_reminder = curr % 10;
                prev_leading_number = curr / 10;
                result.add(curr_reminder);
            }
            if (prev_leading_number > 0) {
                result.add(prev_leading_number);
            }

            return new VeryLongNumber(result);
        }

        public List<Integer> getNumber() {
            return number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            VeryLongNumber that = (VeryLongNumber) o;
            return Objects.equals(number, that.number);
        }


        @Override
        public String toString() {
            return IntStream.range(0,this.number.size())
                    .mapToObj(index -> number.get(this.number.size()-1-index))
                    .map(i -> Integer.toString(i))
                    .collect(Collectors.joining(""));

        }



    }

    public static void main(String[] args) {

        var res = getPowerOfTwo(1000).getSumOfDigits();
        System.out.println("result is "+res);

    }
}
