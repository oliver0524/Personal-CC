package org.example;

import java.util.Arrays;
import java.util.List;

/** two methods; linear and binary searhc. Compare the times that both searches take using
 * automatically generated array with a large amount of numbers*/
public class BinarySearch {

        public static void main(String[] args) {

        int[] nums = generateMillionNumbers();
        int target = 123456;

        long benchmarkTime = System.nanoTime();
        boolean linear = containsN(nums, target);
        benchmarkTime = System.nanoTime() - benchmarkTime;
        System.out.print("Linear search time in nanoseconds: " + benchmarkTime);

        long algorithmTime = System.nanoTime();
        boolean binary = containsLogN(nums, target);
        algorithmTime = System.nanoTime() - algorithmTime;
        System.out.print("\nBinary search time in nanoseconds: " + algorithmTime);
    }

    /**This algorithm is a linear search, which is O(n) because the amount of work needed
     * to complete the operation scales directly with the size of the input 'nums' */
    public static boolean containsN(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
    /**Same search but using the binary algorithm
     * @parms: nums an array of integers; target an int that is being searched for.
     * @return true if nums contains target, false otherwise.*/
    public static boolean containsLogN(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevent potential integer overflow
            int middle = nums[mid];

            if (middle == target) {
                return true;
            } else if (middle < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    /** Method to generate many numbers. Return a million numbers from 0 to 1000000*/
    public static int[] generateMillionNumbers(){
        int[] nums = new int[Integer.MAX_VALUE/3];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i;
        }
        return nums;
    }
}
