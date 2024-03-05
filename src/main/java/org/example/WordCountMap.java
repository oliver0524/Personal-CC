package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** * Receive a string of multiple words.
 * Return a Map object where the key is a word and the value is the count of occurrences of the word.
 *
 * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
 * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
 * is not already a key in the map, and add to the word's count value every time you encounter a word that already
 * exists in the map. */
public class WordCountMap {

    public static void main(String[] args) {

        String input = "apple banana pear melon pear";
        System.out.println("Initial string: " + input);
        Map<String, Integer> actual = returnWordMap(input);
        System.out.println("Occurrences of each word: " + actual);
    }

    public static Map<String, Integer> returnWordMap(String words) {

        String singleWords[] = words.split(" ");  // split string into substrings delimited by " "
        System.out.println("Splitted array: " + Arrays.toString(singleWords));

        // Initialize the new HashMap
        Map<String, Integer> map1 = new HashMap<>();

            for (String word : singleWords) {       // iterate through each word in the singleWords array
                if (map1.containsKey(word)){      // use containsKey method, which checks for an existing key
                    map1.put(word, map1.get(word) + 1); // map1.get gets the existing value
                } else {
                    map1.put(word, 1);              // if the word is not present, add it to the map1 with the count of 1
                }
                //System.out.println("The map is: " + map1);
            }
            System.out.println("The map is: " + map1);
            return map1;
        }


}


