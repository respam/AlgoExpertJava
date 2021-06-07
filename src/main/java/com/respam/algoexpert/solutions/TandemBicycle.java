package com.respam.algoexpert.solutions;

import java.util.Arrays;
import java.util.Collections;

public class TandemBicycle {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {

        int totalSpeed = 0;

        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int arraySize = redShirtSpeeds.length;

        if(fastest) {
            for(int i=0; i<arraySize; i++) {
                totalSpeed = totalSpeed + Math.max(redShirtSpeeds[i], blueShirtSpeeds[(arraySize - 1) - i]);
            }
        }

        if(!fastest) {
            for(int i=0; i<arraySize; i++) {
                totalSpeed = totalSpeed + Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
            }
        }
        return totalSpeed;
    }


    public static void main(String[] args) {

        TandemBicycle tb = new TandemBicycle();
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};

        boolean fastest = false;

        int totalSpeed = tb.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        System.out.println(totalSpeed);

    }
}
