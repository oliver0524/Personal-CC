package org.example;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class Palindrome {

    public static void main(String[] args) {

        //String input = "abcba";
        String input = "123454321";
        //String input = "abcde";
        System.out.println("Initial string: " + input);

        //StringReverse reverseNumber = new StringReverse();

        if (pal(input)) {
            System.out.println("the string a palindrome ");
        }
    }

    public static boolean pal(String input) {

        /** Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
         * You can solve this problem in several ways:
         * You could start with a String reversal algorithm, which you have already written, and check if str is the same
         * or, you could check if the character at the nth position of a String moving forward is the same
         * as the nth position of a String moving backwards. */

        // create an object named ‘temp’ of StringBuffer class and then use append() method to add chars from the end
        // reverse the string. StringBuffer class is used to create mutable (modifiable) strings
            StringBuffer temp = new StringBuffer();

            for (int i=input.length() - 1; i>=0; i--){
                temp.append(input.charAt(i));
            }
            // convert object to back to a String
            String s1 = temp.toString();
            // compare two string. If there are equal, it's a palindrome & return true
            if (input.equals(s1)) {
                return true;
            }
            return false;
            }
        }


