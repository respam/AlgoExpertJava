package com.respam.algoexpert.solutions;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String string) {
        char[] characterArray = string.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char each : characterArray){
            if(map.get(each) != null){
                map.put(each, map.get(each)+1);
            }

            map.putIfAbsent(each, 0);
        }

        for(int i=0; i<characterArray.length; i++){
            if(map.get(characterArray[i]) == 0){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String string = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(string));
    }
}
