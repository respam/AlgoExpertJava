package com.respam.algoexpert.solutions;

import java.util.ArrayList;
import java.util.List;

public class ProductSumSol2 {

    public static int productSum(List<Object> array) {

        return productSumHelper(array, 1);
    }

    private static int productSumHelper(List<Object> array, int multiplier) {

        int sum = 0;

        for(Object each : array) {
            if(each instanceof Integer) {
                sum += (Integer) each;
            }
            else {
                sum += productSumHelper((List) each, multiplier + 1);
            }
        }
        return sum * multiplier;
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
