package com.respam.algoexpert.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIndex = 0;

        if (sequence.size() <= array.size()) {
            for (int i=0; i<array.size(); i++) {
                if (seqIndex < sequence.size()) {
                    if(Objects.equals(array.get(i), sequence.get(seqIndex))) {
                        seqIndex += 1;
                    }
                }
            }
        }

        // return seqIndex == sequence.size()
        if (seqIndex != sequence.size()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] {5, 1, 22, 25, 6, -1, 8, 10};
        Integer[] sequence = new Integer[] {1, 6, -1, 10};

        List<Integer> arrayList = Arrays.asList(array);
        List<Integer> sequenceList = Arrays.asList(sequence);

        boolean result = isValidSubsequence(arrayList, sequenceList);

        System.out.println(result);
    }
}
