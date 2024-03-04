package org.example;

import java.util.Arrays;

/** Fibonacci formula: Fn = Fn-1 + Fn-2, where F0=0; F1=1; F2=1 */
public class Fibonacci {

    static int array[]=new int[100];

    public static void main(String[] args) {
        int input = 4;

        array[0] = 0;
        array[1] = 1;

        System.out.println("Fibonacci string: 0 1 1 2 3 5 8 13 21");

        int result3 = fib(input);
        System.out.println(input + " element of Fibonacci is: " + result3);
    }

    /** Return the nth number of fibonacci sequence
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time. */
    public static int fib(int n){
        if (n==0) {
            return array[0];
        } else if (n==1) {
            return array[1];
        } else {
            array[n] = fib(n-1) + fib(n-2);
            return (array[n]);
        }

    }
}

