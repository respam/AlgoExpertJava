package com.respam.algoexpert.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;

        while(i < j){
            if(array.get(i) == toMove){
                if(array.get(j) == toMove){
                    j--;
                } else if(array.get(j) != toMove){
                    int temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                    i++;
                    j--;
                }
            } else {
                i++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        MoveElementToEnd met = new MoveElementToEnd();
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);
        // [2, 1, 2, 2, 2, 3, 4, 2]

        List<Integer> result = met.moveElementToEnd(array, 2);
        System.out.println(Arrays.toString(result.toArray()));

    }
}
