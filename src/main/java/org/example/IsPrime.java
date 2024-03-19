package org.example;

import java.util.Arrays;

public class IsPrime {
    public static void main(String[] args) {

        //int num = 1000003;
        int num = 84;
        System.out.println("Given number: " + num);
        System.out.println("Is the number prime? " + isPrime(num));
    }

    //return true if n is a prime number, false if n is not a prime number.
    //A prime number isn't divisible by any number other than itself and 1
    public static boolean isPrime(int n) {

        if ((n % 2 == 0) || (n % 3) == 0) {
            return false;
        } else {
            return true;
        }
    }
}

