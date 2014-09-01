package com.scotth.reversewords;

import java.util.Arrays;

/**
 * Created by shogan on 28/08/2014.
 */
public class ReverseString {
    public static String answer, input;

    public ReverseString(String i){
        input = i;
    }
    public static void main(String[] args) {
        answer = reverseString();
    }
    public static String reverseString() {
        String a;
        String[] separateWords = input.split(" ");
        StringBuilder returnString = new StringBuilder();
        int arrayLength = separateWords.length;
        for (int i = 0; i < arrayLength; i++) {
            String word = separateWords[i];
            StringBuilder newSB = new StringBuilder();
            for (int j = word.length()-1; j >-1; j--) {
                newSB.append(word.charAt(j));
            }
            String newWord = newSB.toString();
            returnString.append(newWord);
            returnString.append(" ");
        }
        a = returnString.toString();
        return a.trim();
    }

}