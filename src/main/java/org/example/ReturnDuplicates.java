package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.abs;

public class ReturnDuplicates {

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 4, 4, 1, 0};
        System.out.println("Initial array: " + Arrays.toString(nums));

        int[] nums2 = returnDuplicates(nums);
        System.out.println("Array of duplicate nums: " + Arrays.toString(nums2));
    }

    /** Return an array of all the integers which are duplicates, in any order*/
    public static int[] returnDuplicates(int[] arr){
        // point to the contents of the arr
        int[] arr2 = arr;
        Set<Integer> result = new HashSet<>();

        for (int i=0; i<arr.length; i++){
            for (int j = i+1; j < arr2.length; j++) {
                if (arr[i] == arr2[j]){
                    result.add(arr[i]);
                    break;
                }
            }
        }
        int[] finalResult = result.stream().mapToInt(Integer::intValue).toArray();
        return finalResult;
    }
}
