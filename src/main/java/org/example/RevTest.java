import java.lang.*;
import java.io.*;
import java.util.*;

/** This code iterates through the array, counts the number of even occurrences until it finds
 * the first occurrence of N. If N is found, the count of even occurrences is returned */
public class RevTest
{
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        // WRITE YOUR LOGIC HERE
        /** StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters.
         * Like StringBuffer, the StringBuilder class is an alternative to the Java Strings Class,
         * as the Strings class provides an immutable succession of characters */
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String word : word1) {
            s1.append(word);
        }

        for (String word: word2) {
            s2.append(word);
        }

        String st1 = s1.toString();
        String st2 = s2.toString();
        return st1.equals(st2);

    }


    // DO NOT TOUCH THE CODE BELOW
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner(System.in);
        //String word1Input = sc.nextLine();
        //String word2Input = sc.nextLine();

        String[] word1 = {"hello world!"};

        String[] word2 = {"hello world"};

        boolean result = arrayStringsAreEqual(word1, word2);

        if (result) {
            System.out.println("the two strings are equal");
        } else {
            System.out.println("the two strings are not equal");
        }

    }
}