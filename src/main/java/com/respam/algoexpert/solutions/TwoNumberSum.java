package com.respam.algoexpert.solutions;

import java.util.*;

public class TwoNumberSum {

    /**
     *
     * @param array - list of numbers
     * @param targetSum - sum whose combination needs to be found
     * @return results - array of length 2 having the result
     */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] results = {0,0};
        HashMap<Integer, Integer> checkNum = new HashMap<>();

        for(int temp : array) {
            if (checkNum.get(targetSum - temp) != null) {
                results[0] = temp;
                results[1] = targetSum - temp;
                return results;
            }

            else {
                checkNum.put(temp, 0);
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] finalResults = twoNumberSum(array, targetSum);

        for(int number : finalResults) {
            System.out.println(number);
        }
    }
}
