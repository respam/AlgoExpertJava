package com.respam.algoexpert.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.parallelSort(array);

        ArrayList<Integer[]> result = new ArrayList<>();

        for(int i=0; i<array.length-2; i++){
            if(array[i] <= targetSum){

                int current = i;
                int left = i + 1;
                int right = array.length - 1;
                int sum;

                while(left != right){
                    sum = array[current] + array[left] + array[right];
                    if(sum == targetSum){
                        Integer[] resultArray = {array[current], array[left], array[right]};
                        result.add(resultArray);
                        left = left + 1;
                    }

                    if(sum > targetSum){
                        right = right - 1;
                    }

                    if(sum < targetSum){
                        left = left + 1;
                    }

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
//        int targetSum = 0;

        int[] array = {1, 2, 3};
        int targetSum = 6;

        List<Integer[]> result = threeNumberSum(array, targetSum);

        for(Integer[] each : result){
            for(int value : each){
                System.out.println(value);
            }
            System.out.println("\n");
        }
    }
}
