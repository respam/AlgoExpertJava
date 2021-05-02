package com.respam.algoexpert.solutions;

import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {

        if(coins.length == 0) {
            return 1;
        }

        int minPossibleChange = 0;
        Arrays.sort(coins);

        for(int coin : coins) {
            if(coin <= minPossibleChange + 1) {
                minPossibleChange = minPossibleChange + coin;
            } else {
                minPossibleChange = minPossibleChange + 1;
                return minPossibleChange;
            }
        }

        minPossibleChange += 1;
        return minPossibleChange;
    }

    public static void main(String[] args) {
        NonConstructibleChange ncc = new NonConstructibleChange();
        int[] availableCoins = new int[] {5, 7, 1, 1, 2, 3, 22};
        int result = ncc.nonConstructibleChange(availableCoins);

        System.out.println(result);
    }
}
