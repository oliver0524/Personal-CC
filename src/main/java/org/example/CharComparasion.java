package org.example;

import java.util.Arrays;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class CharComparasion {

    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        //char[] input1 = {'c', 'a', 't'};
        //char[] input2 = {'d', 'o', 'g'};
        //char[] input1 = {'m', 'o', 'u', 's', 'e'};
        //char[] input2 = {'m', 'o', 'u', 's', 'e'};
        char[] input1 = {'d', 'o', 't'};
        char[] input2 = {'d', 'o', 'g'};
        System.out.println("Initial string: " + Arrays.toString(input1) + Arrays.toString(input2));

        int result3 = compare(input1, input2);
        System.out.println("Compare result " + result3);
    }

    /** This implementation compares the arrays character by character until it finds a difference
    * or reaches the end of one of the arrays
    * return -1 if A is less than B, 1 if A is greater than B, and 0 if A=B */
    public static int compare(char[] a, char[] b){
        int minLength = Math.min(a.length, b.length);

        for (int i = 0; i < minLength; i++) {
            if (a[i] < b[i]) {
                return -1; // A is less than B
            } else if (a[i] > b[i]) {
                return 1; // A is greater than B
            }
        }

        // At this point, either one array is a prefix of the other, or both arrays are identical up to minLength.
        if (a.length < b.length) {
            return -1; // A is a prefix of B
        } else if (a.length > b.length) {
            return 1; // B is a prefix of A
        } else {
            return 0; // Both arrays are identical
        }
    }
}

