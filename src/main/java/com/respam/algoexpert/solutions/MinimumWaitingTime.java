package com.respam.algoexpert.solutions;

import java.util.Arrays;

public class MinimumWaitingTime {
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int waitingTime = 0;
        int totalWaitingTime = 0;

        if(queries.length == 1) {
            return totalWaitingTime;
        } else {
            for(int i=0; i<queries.length-1; i++) {
                waitingTime = queries[i] + waitingTime;
                queries[i] = waitingTime;
                totalWaitingTime = totalWaitingTime + waitingTime;
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
