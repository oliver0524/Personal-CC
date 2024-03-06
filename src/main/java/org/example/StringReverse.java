package org.example;

/** Write a program that prompts the user to input an integer
 * and then outputs the number with the digits reversed.
 * For example, if the input is 12345, the output should be 54321.*/
public class StringReverse {

    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        String s = "abcdefjha2";
        System.out.println("Initial string: " + s);

        //StringReverse reverseNumber = new StringReverse();

        String result3 = StringReverse.reverse(s);
        System.out.println("Reversed string " + result3);
    }

    public static String reverse(String str) {

        /** create an object named ‘temp’ of StringBuffer class and then append() method
         * inside of the for loop to add characters of a string starting from the end */

        StringBuffer temp = new StringBuffer();

            for (int i=str.length() - 1; i>=0; i--){
                temp.append(str.charAt(i));
            }
            // convert object to String
            return temp.toString();
        }
    }

