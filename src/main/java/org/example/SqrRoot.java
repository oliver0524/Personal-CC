package org.example;

import java.util.Arrays;

public class SqrRoot {
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

