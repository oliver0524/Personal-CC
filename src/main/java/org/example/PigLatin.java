package org.example;
import static jdk.nashorn.internal.objects.NativeString.substring;

/** every word has its first character moved to the end, and 'ay' is added to the end of the word.
 * word = ordway; pig = igpay */

public class PigLatin {

        public static void main(String[] args) {

            String input = "banana";
            String actual = PigLatin(input);
            System.out.println("PigLatin: " + (actual));
        }

        public static String PigLatin(String in){
            String s1 = substring(in,1,in.length());
            String s2 = substring(in,0,1);
            String s3 = s1 + s2 + "ay";

            return s3;
        }
}
