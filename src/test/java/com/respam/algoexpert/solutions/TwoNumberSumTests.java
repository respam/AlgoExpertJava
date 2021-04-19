package com.respam.algoexpert.solutions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TwoNumberSumTests {
    @Test
    void Test1() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        printUtility(output);
//        Assertions.assertTrue(output.length == 2);
//        Assertions.assertTrue(contains(output, -1));
//        Assertions.assertTrue(contains(output, 11));
    }

    @Test
    void Test2() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6}, 10);
        printUtility(output);
    }

    @Test
    void Test3() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6, 1}, 5);
        printUtility(output);
    }

    public boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }

    public void printUtility(int[] output) {
        for (int value : output) {
            System.out.println(value);
        }
    }
}
