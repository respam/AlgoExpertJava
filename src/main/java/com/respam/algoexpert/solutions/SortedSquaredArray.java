package com.respam.algoexpert.solutions;

public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        int array_size = array.length;
        int[] sqArray =new int[array_size];

        int small_idx = 0;
        int large_idx = array_size - 1;

        for (int i=1; i<=array_size; i++) {
            if (Math.abs(array[small_idx]) >= Math.abs(array[large_idx])) {
                sqArray[array_size-i] = array[small_idx] * array[small_idx];
                small_idx += 1;
            } else {
                sqArray[array_size-i] = array[large_idx] * array[large_idx];
                large_idx -= 1;
            }
        }
        return sqArray;
    }

    public static void main(String[] args) {
        int[] questionArray = new int[] {-6, -4, -2, -1, 0, 4, 5, 6, 9};
        SortedSquaredArray st = new SortedSquaredArray();
        int[] resultArray = st.sortedSquaredArray(questionArray);

        for (int val : resultArray) {
            System.out.println(val);
        }
    }
}
