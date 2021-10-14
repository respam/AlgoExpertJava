package com.respam.algoexpert.solutions;

import java.util.ArrayList;

public class RunLengthEncoding {
    public static String runLengthEncoding(String string) {
        char[] characters = string.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        int length = 1;
        int i;
        for(i=1; i<characters.length; i++){
            if(length == 9 || characters[i] != characters[i-1]){
                result.add(Integer.toString(length));
                result.add(Character.toString(characters[i-1]));
                length = 0;
            }

            length += 1;
        }

        if(length != 0){
            result.add(Integer.toString(length));
            result.add(Character.toString(characters[i-1]));
        }

        StringBuffer sb = new StringBuffer();
        for(String ch : result){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String string = "AAAAAAAAAAAAABBCCCCDD";
        System.out.println(runLengthEncoding(string));
    }
}
