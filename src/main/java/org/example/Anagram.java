package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

        public static void main(String[] args) {

            //String input1 = "cat";
            //String input2 = "tac";
            //String input1 = "restful";
            //String input2 = "fluster";
            //String input1 = "anagram";
            //String input2 = "margana";
            //String input1 = "cat";
            //String input2 = "dog";
            String input1 = "anagram";
            String input2 = "margarn";

            System.out.print("word 1: " + input1);
            System.out.println(" | word 2: " + input2);

            if (check(input1, input2)) {
                System.out.println("The given words are anagrams");
            } else {
                System.out.println("The given words are not anagrams");
            }

    }

    /** An anagram is a word that is the reordering of another word's letters. Letter counts must be exact."
     * return True if s2 is an anagram of s1, false otherwise. */
    public static boolean check(String s1, String s2){
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false; // Handle null strings or different lengths
        }

        int[] charCounts = new int[256]; // Assuming ASCII characters

        for (char c : s1.toLowerCase().toCharArray()) {
            charCounts[c]++;
        }

        for (char c : s2.toLowerCase().toCharArray()) {
            charCounts[c]--;
            if (charCounts[c] < 0) { // Not enough characters in s2
                return false;
            }
        }

        return true; // All characters balanced means anagram
    }
}