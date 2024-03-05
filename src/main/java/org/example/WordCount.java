package org.example;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class WordCount {

    public static void main(String[] args) {

        String input = "apple banana pear melon tr";
        System.out.println("Initial string: " + input);
        int count = count(input);
        System.out.println("The word count is: " + count);
    }

    /**
     * in is a String representing a sentence, with words delineated by spaces.
     * return the amount of words in the string.
     */
    public static int count(String in) {
        int wordCount = 0;
        String words[] = in.split(" ");  // split string into substrings delimited by " "
        return words.length;
//        if (words != null) {
//            for (String word : words) {         // for each encountered word, increment the count
//                System.out.println("The word is: " + word);
//                wordCount++;
//            }
//        }
//        return wordCount;
    }

}


