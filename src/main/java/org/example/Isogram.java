package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Isogram {


    public static void main(String[] args) {

        /** An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
         * letters in the String.
         *
         * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
         * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
         * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
         * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
         *
         * @param str a String.
         * @return true if str is an isogram, false otherwise. */

        String input = "cat";
        //List<Integer> list = Arrays.asList(input);
        System.out.print("Current array " + input);
        if (isIsogram(input)) {
            System.out.print("\nIt is an isogram");
        } else {
            System.out.print("\nIt is NOT an isogram");
        }
    }

    //return possible sum of separate numbers from nums
    public static boolean isIsogram(String str) {

        Set<Character> charSet = new HashSet<>();

        for (char c : str.toCharArray()) {  // convert string to an array
            if (!charSet.add(c)) {          // try to add a char to a set
                return false;
            }
        }
        System.out.print("\nNew set: " + charSet);
        return true;
//        Set<Character> newSet =
//                str.chars()                     // Convert String to IntStream
//                .mapToObj(chr -> (char) chr)  //autoboxed to character; Convert IntStream to Stream<Character>
//                .collect(Collectors.toSet()); // Collect the elements as a Set Of Characters
//        System.out.print("Current array: " + newSet);
//        return true;
//    }
        //return false;
    }
}
