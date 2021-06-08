package com.respam.algoexpert.solutions;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array) {
        int sum = 0;
        int depth = 1;
        int multiplier = 1;

        sum = sumCalculator(array, sum, depth, multiplier);

        return sum;
    }

    public static int sumCalculator(List<Object> questionArray, int sum, int depth, int multiplier) {
        for(Object each : questionArray) {
            if(each instanceof Integer) {
                sum = sum + (multiplier * (Integer) each);
            }

            if(each instanceof ArrayList) {
                depth = depth + 1;
                multiplier = multiplier * (depth);
                sum = sumCalculator((List) each, sum, depth, multiplier);
                multiplier = multiplier / depth;
                depth = depth - 1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Object> array = new ArrayList<Object>();
        array.add(5);
        array.add(2);
        ArrayList<Object> a = new ArrayList<>();
        a.add(7);
        a.add(-1);
        array.add(a);
        array.add(3);
        ArrayList<Object> b = new ArrayList<>();
        ArrayList<Object> c = new ArrayList<>();
        b.add(6);
        c.add(-13);
        c.add(8);
        b.add(c);
        b.add(4);
        array.add(b);

        int result = productSum(array);

        System.out.println(result);

    }
}
