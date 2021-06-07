package com.respam.algoexpert.solutions;

import java.util.HashMap;

public class NthFibinacci {

    public static int getNthFib(int n) {

        HashMap<Integer, Integer> store = new HashMap<>();
        store.put(1,0);
        store.put(2,1);

        if(n == 1){
            return 0;
        }

        if (n == 2){
            return 1;
        }

        if(n > 2) {
            for(int i=3; i<=n; i++){
                store.put(i, store.get(i-1) + store.get(i-2));
            }
        }

        return store.get(n);
    }

    public static void main(String[] args) {
        int result = getNthFib(7);

        System.out.println(result);
    }
}
