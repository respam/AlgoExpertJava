package com.respam.algoexpert.solutions;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        for(int i=array.length-1; i>0; i--) {
            boolean changeMade = false;
            for(int j=0; j<i; j++ ){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    changeMade = true;
                }
            }
            if(!changeMade) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};

        int[] finalResult = bubbleSort(array);
        for(int each : finalResult) {
            System.out.println(each);
        }
    }
}
