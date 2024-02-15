package org.example;

class RemoveAll {
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
