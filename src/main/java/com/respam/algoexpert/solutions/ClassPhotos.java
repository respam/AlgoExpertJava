package com.respam.algoexpert.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassPhotos {
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        boolean result = true;
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        boolean redShirtFirst;
        if(redShirtHeights.get(0) < blueShirtHeights.get(0)) {
            redShirtFirst = true;
        } else if(redShirtHeights.get(0) > blueShirtHeights.get(0)) {
            redShirtFirst = false;
        } else
            return false;

        for(int i=0; i<redShirtHeights.size(); i++) {
            if(redShirtFirst) {
                if(redShirtHeights.get(i) > blueShirtHeights.get(i)) {
                    result = false;
                    break;
                }
            }

            if(!redShirtFirst) {
                if(redShirtHeights.get(i) < blueShirtHeights.get(i)) {
                    result = false;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> red = new ArrayList<>();
        red.add(5);
        red.add(8);
        red.add(1);
        red.add(3);
        red.add(4);

        ArrayList<Integer> blue = new ArrayList<>();
        blue.add(6);
        blue.add(9);
        blue.add(2);
        blue.add(4);
        blue.add(5);

        ClassPhotos cp = new ClassPhotos();
        boolean result = false;
        result = cp.classPhotos(red, blue);

        System.out.println(result);
    }
}
