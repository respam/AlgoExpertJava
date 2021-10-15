package com.respam.algoexpert.solutions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenerateDocument {

    public static boolean generateDocument(String characters, String document) {

        char[] characterArray = characters.toCharArray();
        char[] documentArray = document.toCharArray();

        HashMap<Character, Integer> characterMap = new HashMap<>();
        HashMap<Character, Integer> documentMap = new HashMap<>();

        for (char each:characterArray) {
            characterMap.putIfAbsent(each, 1);

            if (characterMap.get(each) != null){
                characterMap.put(each, characterMap.get(each) + 1);
            }
        }

        for (char each:documentArray) {
            if (documentMap.get(each) != null){
                documentMap.put(each, documentMap.get(each) + 1);
            }

            documentMap.putIfAbsent(each, 1);
        }

        Iterator dmIterator = documentMap.entrySet().iterator();

        while (dmIterator.hasNext()){
            Map.Entry element = (Map.Entry)dmIterator.next();
            int occurrence = (int)element.getValue();

            if(characterMap.get(element.getKey()) == null){
                return  false;
            }

            if(characterMap.get(element.getKey()) < occurrence){
                return  false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String characters = "aheaolabbhb";
        String document = "hello";

        System.out.println(generateDocument(characters, document));
    }
}
