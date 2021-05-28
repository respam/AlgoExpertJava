package com.respam.algoexpert.solutions;

import java.util.Arrays;

public class MinimumWaitingTime {
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int totalWaitingTime = 0;

        if(queries.length == 1) {
            return totalWaitingTime;
        } else {
            for(int i=0; i<queries.length-1; i++) {

                if (i != 0) {
                    queries[i] = queries[i] + queries[i - 1];
                }
                totalWaitingTime = totalWaitingTime + queries[i];
            }
        }
        return totalWaitingTime;
    }

    public static void main(String[] args) {
        int[] question = {3, 2, 1, 2, 6};
        MinimumWaitingTime mwt = new MinimumWaitingTime();
        int minWaitTime = mwt.minimumWaitingTime(question);

        System.out.println(minWaitTime);
    }
}
