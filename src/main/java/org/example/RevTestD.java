package org.example;

import java.util.*;

/** You are given a list of strings. Order them alphabetically.  If two of them start with the same letter, check the
 * next letter, etc*/

public class RevTestD {
    public static int checkForALetter(List<String> stringList, String letter) {
        //WRITE YOUR CODE HERe
        letter = letter.toLowerCase();
        int count = 0;

        for (String str: stringList) {
            if (str.toLowerCase().contains(letter)){
                count++;
            }
        }
        return count;
    }


    // DO NOT TOUCH THE CODE BELOW
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        String[] inputArray = {"Car", "Boat", "Plane", "Train"};
        String letter = "a";
        //sc.close();
        List<String> stringList = new ArrayList<String>();
        for(int i=0;i<inputArray.length;i++){
            stringList.add(inputArray[i]);
        }
        int times = checkForALetter(stringList, letter);
        System.out.println("In string: "+ Arrays.toString(inputArray)+" letter "+letter+" is "+times+" times.");
    }
}

