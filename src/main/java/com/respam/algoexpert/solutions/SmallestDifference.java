package com.respam.algoexpert.solutions;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

        Arrays.parallelSort(arrayOne);
        Arrays.parallelSort(arrayTwo);
        int[] result = {0,0};
        int absDiff = Integer.MAX_VALUE;

        int firstPointer = 0;
        int secondPointer = 0;

        while(firstPointer < arrayOne.length && secondPointer < arrayTwo.length){
            int numberOne = arrayOne[firstPointer];
            int numberTwo = arrayTwo[secondPointer];
            int currDiff = 0;

            if((numberOne > 0 && numberTwo < 0) || (numberOne < 0 && numberTwo > 0)){
                currDiff = Math.abs(numberOne) + Math.abs(numberTwo);
            } else {
                currDiff = Math.abs(Math.abs(numberOne) - Math.abs(numberTwo));
            }

            if(currDiff == 0){
                result[0] = numberOne;
                result[1] = numberTwo;

                return result;
            }

            if(currDiff < absDiff){
                absDiff = currDiff;
                result[0] = numberOne;
                result[1] = numberTwo;
            }

            if(numberOne < numberTwo){
                firstPointer += 1;
            } else {
                secondPointer += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};

        int[] result = smallestDifference(arrayOne, arrayTwo);

        for(int each : result){
            System.out.println(each);
        }
    }
}
