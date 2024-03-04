package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.IsThereSum.check;

public class LargestSum {

    //public static IsThereSum its;
    //public static void setUp(){
    //its = new IsThereSum();

    public static void main(String[] args) {

        /** Given the input {2, 2, 3, 4, 5} and a target 4, there is a sum of 4 of 2+2.*/
        Integer[] input = new Integer[] {7, 3, 3, 4, 2};
        List<Integer> list = Arrays.asList(input);
        System.out.print("Current array " + list);
        int sum = bigSum(list);
        System.out.print("Largest Sum= " + sum);
    }

    //return possible sum of separate numbers from nums
    public static int bigSum(List<Integer> nums) {
        // initialize arr2
        List <Integer> arr2;
        // point to the contents of the arr
        arr2 = nums;
        int largestSum = 0;
        //System.out.println("Contents of arr2[] ");
        /** Get the largest possible sum that can be obtained from a pair of values in the list.
         * A number can't be added to itself, unless there are duplicates. return the largest */
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                //System.out.print("\nnums.get(i)= " + nums.get(i));
                //System.out.print(" arr2.get(j)= " + arr2.get(j));
                //System.out.print("\nSum= " + (arr[i] + arr2[j]));
                if ((nums.get(i) + arr2.get(j)) > largestSum && i != j) {
                    System.out.print("Current Sum= " + (nums.get(i) + arr2.get(j)));
                    largestSum = nums.get(i) + arr2.get(j);
                }
            }
        }
        return largestSum;
    }

}
