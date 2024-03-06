package org.example;

/** output
 * Result using loop: Hell Wrld
 * Result using replaceAll: Hell Wrld */

class RemoveAll {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char charToRemove = 'o';

        RemoveAll removeAll = new RemoveAll();

        // Method 1: Using a for loop
        String result1 = removeAll.removeCharacterUsingLoop(inputString, charToRemove);
        System.out.println("Result using loop: " + result1);

        // Method 2: Using replaceAll method
        String result2 = removeAll.removeCharacterUsingReplaceAll(inputString, charToRemove);
        System.out.println("Result using replaceAll: " + result2);
    }

    // Method to remove a character using a for loop
    public static String removeCharacterUsingLoop(String str, char ch) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    // Method to remove a character using replaceAll method
    public static String removeCharacterUsingReplaceAll(String str, char ch) {

        String charToRemove = String.valueOf(ch);
        return str.replaceAll(charToRemove, "");
    }
}
