package com.respam.algoexpert.solutions;

public class SelectionSort {

    private static int[] selectionSort(int[] array) {
        for(int i=0; i<array.length-1; i++){
            int smallest_index = i;
            for(int j=i+1; j<=array.length-1; j++){
                if(array[smallest_index] > array[j])
                    smallest_index = j;
            }
            int temp = array[i];
            array[i] = array[smallest_index];
            array[smallest_index] = temp;

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};

        int[] finalResult = selectionSort(array);
        for(int each : finalResult) {
            System.out.println(each);
        }
    }
}
