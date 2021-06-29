package com.respam.algoexpert.solutions;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, array[0]};
        for(int i=1; i<array.length; i++ ) {
            if (array[i] >= result[2]) {
                result[0] = result[1];
                result[1] = result[2];
                result[2] = array[i];
            }
            else if(array[i] < result[2] && array[i] >= result[1]) {
                result[0] = result[1];
                result[1] = array[i];
            }
            else if(array[i] < result[2] && array[i] < result[1] && array[i] >= result[0]) {
                result[0] = array[i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};

        int[] finalResult = findThreeLargestNumbers(array);
        for(int each : finalResult) {
            System.out.println(each);
        }
    }

}

