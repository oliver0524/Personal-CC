package org.example;

import java.util.Arrays;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class SubArray {

    public static void main(String[] args) {

        int[] input = {0,1,2,3,4,5};
        int inputStart = 0;
        int inputEnd = 4;
        System.out.println("Initial string: " + Arrays.toString(input) + "; start pos: " + inputStart + "; end pos: " + inputEnd);
        int[] result = sub(input, inputStart, inputEnd);
        System.out.println("The resulting array: " + Arrays.toString(result));
    }

    /** You will need to create a new array whose size is only the amound of elements requested between the start and
     * end index, and then write a for loop which copies values from nums over to this new resulting array. */
    public static int[] sub(int[] nums, int start, int end) {
        int subNum[] = Arrays.copyOfRange(nums, start, end);
        System.out.println("The sub-array is: " + Arrays.toString(subNum));
        return subNum;
    }

}


