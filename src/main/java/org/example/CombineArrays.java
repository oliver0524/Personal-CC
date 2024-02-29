package org.example;

import java.util.Arrays;

/**return an array containing the contents of arr1 followed by the contents of arr2.*/
public class CombineArrays {

    public static void main(String[] args) {

        int[] input1 = {0,1,2};
        int[] input2 = {3,4,5};
        System.out.println("array1: " + Arrays.toString(input1));
        System.out.println("array2: " + Arrays.toString(input2));

        int[] comb = combine(input1, input2);
        System.out.println("Combined array : " + Arrays.toString(comb));
    }

    public static int[] combine(int[] arr1, int[] arr2){
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int[] result = new int[arr1Len + arr2Len];

        //tells the program to copy arr1 starting from index 0 to the result array from index 0 to the arr1Len
        System.arraycopy(arr1, 0, result, 0, arr1Len);
        //copy arr2 starting from index 0 to the result array from arr1Len to arr2Len
        System.arraycopy(arr2, 0, result, arr1Len, arr2Len);
        return result;
    }

}
