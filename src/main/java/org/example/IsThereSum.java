package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

public class IsThereSum {

    //public static IsThereSum its;
    //public static void setUp(){
    //its = new IsThereSum();

    public static void main(String[] args) {

        /** Given the input {2, 2, 3, 4, 5} and a target 4, there is a sum of 4 of 2+2.*/
        int[] input = {2, 2, 3, 4, 5};
        int target = 10;
        check(input, target);
    }

    //return true if two separate values in the array add up to a target, false otherwise
    public static boolean check(int[] arr, int target) {
        // initialize arr2
        int[] arr2 = new int[arr.length];
        // point to contents of arr
        arr2 = arr;
        //System.out.println("Contents of arr2[] ");
        /** compare each number of one array to each number of another array; if they add up to the target,
         * return true; also check that you're not adding a number to itself */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                //System.out.print("\narr[i]= " + arr[i]);
                //System.out.print(" arr2[j]= " + arr2[j]);
                //System.out.print("\nSum= " + (arr[i] + arr2[j]));
                if ((arr[i] + arr2[j]) == target && i != j) {
                    System.out.print("Sum= " + (arr[i] + arr2[j]));
                    return true;

                }
            }
        }
        return false;

    }

}
