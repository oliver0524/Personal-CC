package org.example;

import java.util.Locale;

public class LettersToNumbers {

    public static String lettersToNumbers(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String secret = "";
        String lc = s.toLowerCase(Locale.forLanguageTag(s));

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < lc.length(); j++) {
                if (lc.charAt(j) == alphabet.charAt(i)) {
                    if ((i+1) < 10) {
                        secret = secret + '0' + (i + 1);
                    } else {
                        secret = secret + (i + 1);
                    }
                }
            }
        }
        return secret;
    }

    public static String lettersToNumbers2(String s) {
        //String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String secret = "";
        String lc = s.toLowerCase(Locale.forLanguageTag(s));

        for (int j = 0; j < lc.length(); j++) {
            //if (s.charAt(j) == alphabet.charAt(i)) {
            secret = secret + (lc.charAt(j)-96);
            //System.out.println("Current: " + s.charAt(j));
            //System.out.println("Current: " + (int)(s.charAt(j)-96));
            }
        return secret;
    }
}
