package com.respam.algoexpert.solutions;

public class CaesarCipherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        char[] inputString = str.toCharArray();
        for(int i=0; i<inputString.length; i++){
            int finalAsciiValue = (int) inputString[i] + key;
            while(finalAsciiValue > 122){
                finalAsciiValue = (finalAsciiValue % 122) + 96;
            }
            inputString[i] = (char) finalAsciiValue;
        }
        return new String(inputString);
    }

    public static void main(String[] args) {
        String str = "xyz";
        int key = 2;

        System.out.println(caesarCypherEncryptor(str, key));
    }
}
