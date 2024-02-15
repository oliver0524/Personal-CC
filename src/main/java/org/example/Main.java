package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s = "AByxZ";
        String s1 = LettersToNumbers.lettersToNumbers(s);
        System.out.println("Letters: " + s);
        System.out.println("Letters to Numbers: " + s1);
        String s2 = LettersToNumbers.lettersToNumbers2(s);
        System.out.println("Letters to Numbers2: " + s2);

//        Scanner console = new Scanner(System.in);
//        System.out.println("Guess My Number Game");
//        System.out.println();
//        int num = GuessMyNumber.guessMyNumber();
//        System.out.println("The guessed number " + num);



        //Scanner console = new Scanner(System.in);
        int number = 3489;
        System.out.println("Initial number: " + number);

        ReverseNumber reverseNumber = new ReverseNumber();

        int result3 = ReverseNumber.reverseNumber(number);
        System.out.println("Reverse number: " + result3);



        double[] nums = {1,2,3,4,5};
        System.out.println("Initial array: " + Arrays.toString(nums));

        SqrRoot sqrRoot = new SqrRoot();

        int[] srqRt = SqrRoot.findsqrRoot(nums);
        System.out.println("Square root of numbers: " + Arrays.toString(srqRt));




        String inputString = "Hello World";
        char charToRemove = 'o';

        RemoveAll removeAll = new RemoveAll();

        // Method 1: Using a for loop
        String result1 = removeAll.removeCharacterUsingLoop(inputString, charToRemove);
        System.out.println("Result using loop: " + result1);

        // Method 2: Using replaceAll method
        String result2 = removeAll.removeCharacterUsingReplaceAll(inputString, charToRemove);
        System.out.println("Result using replaceAll: " + result2);
    }
}