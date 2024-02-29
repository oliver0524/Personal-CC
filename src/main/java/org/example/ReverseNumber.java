package org.example;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class ReverseNumber {

    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        int number = 3489;
        System.out.println("Initial number: " + number);

        ReverseNumber reverseNumber = new ReverseNumber();

        int result3 = ReverseNumber.reverseNumber(number);
        System.out.println("Reverse number: " + result3);
    }

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

