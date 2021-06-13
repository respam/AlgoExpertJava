package com.respam.algoexpert.solutions;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array,0,array.length-1,target);
    }

    public static int binarySearchHelper(int[] array, int beginning, int end, int target){
        int median = (beginning + end) / 2;

        if(beginning == end && array[median] != target) {
            return -1;
        }

        if(array[median] == target) {
            return median;
        }

        if(array[median] > target) {
            return binarySearchHelper(array,beginning,(median-1),target);
        }

        if(array[median] < target) {
            return binarySearchHelper(array,(median+1),end,target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 23, 111};

        int result = binarySearch(array, 33);
        System.out.println(result);
    }
}
