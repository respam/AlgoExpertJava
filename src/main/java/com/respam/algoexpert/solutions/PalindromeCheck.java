package com.respam.algoexpert.solutions;

import java.util.Stack;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        if(str.length() == 1){
            return true;
        }
        String outputString = "";
        Stack<Character> charStack = new Stack<Character>();
        for(char each : str.toCharArray()){
            charStack.push(each);
        }
        while(charStack.size() > 0){
            outputString = outputString + charStack.pop().toString();
        }
        return outputString.equals(str);
    }

    public static void main(String[] args) {
        String str = "abcdcba";
        Boolean result = isPalindrome(str);

        System.out.println(result);
    }
}
