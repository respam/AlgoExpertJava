package com.respam.algoexpert.solutions;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for(int i=1; i<=array.length-1; i++) {
            for(int j=i-1; j>=0; j--) {
                if(array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } else
                    break;
            }
    }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};

        int[] finalResult = insertionSort(array);
        for(int each : finalResult) {
            System.out.println(each);
        }
    }
}
