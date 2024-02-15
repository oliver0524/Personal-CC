package org.example;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class ReverseNumber {

    public static int reverseNumber(int number) {

            int reverse = 0;

            int temp = number;
            int remainder = 0;

            while(temp>0)
            {
                remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp /= 10;
            }
            return reverse;
        }
    }

