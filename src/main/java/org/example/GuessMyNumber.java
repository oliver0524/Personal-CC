package org.example;
import java.util.Scanner;

public class GuessMyNumber {

    public static int guessMyNumber() {

        Scanner sc = new Scanner(System.in);

        int number = 0; // To hold the random number
        int guess = 0;  // To hold the number guessed by user
        int tries = 0; // To hold number of tries

    number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100

        do
    {
        System.out.print("Enter a guess between 1 and 100 : ");
        guess = Integer.parseInt(sc.nextLine());

        tries++;

        if (guess > number) {
            System.out.println("Too high! Try Again");
        } else if (guess < number) {
            System.out.println("Too low! Try Again");
        } else {
            System.out.println("Correct! You got it in " + tries + " guesses!");
        }

    }  while (guess != number);
        return number;
}
}
