package org.example;

import java.util.Arrays;

import static java.lang.Math.abs;

public class ArrayAbsoluteValue {

    public static void main(String[] args) {

        int[] nums = {1, -3, 5, -6};
        System.out.println("Initial array: " + Arrays.toString(nums));

        int[] nums2 = getArrayAbs(nums);
        System.out.println("Array of absolute nums: " + Arrays.toString(nums2));
    }

    /** produce an array of integers composed of absolute values of all the numbers in 'nums'.*/
    public static int[] getArrayAbs(int[] nums){
        int[] nums2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums2[i] = abs(nums[i]);
        }
        return nums2;
    }
}
