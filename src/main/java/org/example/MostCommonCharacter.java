package org.example;

import java.util.HashMap;
import java.util.Map;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class MostCommonCharacter {

    public static void main(String[] args) {

        String str = "5003196532" + "8932857241" + "1886684186" + "2095882212" +
                "7736052319" + "0513214100" + "9837113941" + "5535441504" + "6350518702" + "5831217238";
        System.out.println("Initial string: " + str);
        char ch = recurringChar(str);
        System.out.println("The most recurring char: " + ch);
    }

    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.*/
    public static char recurringChar(String str) {
        // Create a HashMap to store the count of each character
        Map<Character, Integer> charCount = new HashMap<>();

    // Iterate through the string and count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

    // Find the character with the maximum count
        int maxCount = 0;
        char maxChar = '\0';
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Encountered times: " + maxCount);
        return maxChar;

    }

}


