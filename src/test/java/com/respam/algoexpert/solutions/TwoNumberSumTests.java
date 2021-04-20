package com.respam.algoexpert.solutions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TwoNumberSumTests {
    @Test
    void Test1() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, -1));
        Assertions.assertTrue(contains(output, 11));
    }

    @Test
    void Test2() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6}, 10);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, 6));
        Assertions.assertTrue(contains(output, 4));
    }

    @Test
    void Test3() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6, 1}, 5);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, 1));
        Assertions.assertTrue(contains(output, 4));
    }

    @Test
    void Test4() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6, 1, -3}, 3);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, -3));
        Assertions.assertTrue(contains(output, 6));
    }

    @Test
    void Test5() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, 9));
        Assertions.assertTrue(contains(output, 8));
    }

    @Test
    void Test6() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, 15));
        Assertions.assertTrue(contains(output, 3));
    }

    @Test
    void Test7() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, 0));
        Assertions.assertTrue(contains(output, -5));
    }

    @Test
    void Test8() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, -47));
        Assertions.assertTrue(contains(output, 210));
    }

    @Test
    void Test9() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        Assertions.assertTrue(output.length == 0);
    }

    @Test
    void Test10() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        Assertions.assertTrue(output.length == 0);
    }

    @Test
    void Test11() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {14}, 15);
        Assertions.assertTrue(output.length == 0);
    }

    @Test
    void Test12() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {15}, 15);
        Assertions.assertTrue(output.length == 0);
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
