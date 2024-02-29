package org.example;

import java.util.Arrays;

public class SqrRoot {
    public static void main(String[] args) {

        double[] nums = {1,2,3,4,5};
        System.out.println("Initial array: " + Arrays.toString(nums));

        SqrRoot sqrRoot = new SqrRoot();

        int[] srqRt = SqrRoot.findsqrRoot(nums);
        System.out.println("Square root of numbers: " + Arrays.toString(srqRt));
    }

    public static int[] findsqrRoot(double[] nums) {
        int[] sqrRoot = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sqrRoot[i] = (int) (nums[i] * nums[i]);
            //System.out.println("current: " + nums[i]);
            //System.out.println("current: " + sqrRoot[i]);
        }
        return sqrRoot;
    }
}

