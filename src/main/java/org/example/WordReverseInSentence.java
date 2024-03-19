package org.example;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class WordReverseInSentence {

    public static void main(String[] args) {
        String s = "This is the original";
        System.out.println("Given sentence: " + s);

        String result = WordReverseInSentence.reverse(s);
        System.out.println("Reversed words in the given sentence: " + result);
    }

    /**  Given a string with multiple words separated by spaces, reverse all the words while maintaining the order.
     * eg: This is the original becomes sihT si eht lanigiro */
    public static String reverse(String str) {

        if (str == null || str.isEmpty()) {
            return str;  // Handle empty or null strings
        }

        String[] words = str.split(" ");  // Split string into words using spaces as delimiter
        StringBuilder reversedStr = new StringBuilder();

        for (String word : words) {
            reversedStr.append(new StringBuilder(word).reverse()).append(" ");  // Reverse each word and append with space
        }

        // Remove trailing space from the last word
        return reversedStr.toString().trim();
    }
}

