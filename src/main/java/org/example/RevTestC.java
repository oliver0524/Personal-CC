package org.example;
import java.util.*;

/** You are given a list of strings. Order them alphabetically.  If two of them start with the same letter, check the
 * next letter, etc*/

public class RevTestC {
    public static List<String> alphabetize(List<String> stringList) {
        //use an existing method from Collections
        Collections.sort(stringList);
        return stringList;
    }


    // DO NOT TOUCH THE CODE BELOW
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        String[] inputArray = {"Car","tar","Far","Large"};
        //sc.close();
        List<String> stringList = new ArrayList<String>();
        for(int i=0;i<inputArray.length;i++){
            stringList.add(inputArray[i]);
        }
        List sortedList = alphabetize(stringList);
        String result = "[";
        for(int i=0;i<sortedList.size();i++){
            if(i==sortedList.size()-1){
                result+=sortedList.get(i)+"]";
            }else{
                result+=sortedList.get(i)+",";
            }
        }
        //String [] sortedArray = alphabetize(stringList);
        System.out.println("Initial array: "+ Arrays.toString(inputArray));
        System.out.println("Sorted array: "+ (sortedList));
    }
}

