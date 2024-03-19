package org.example;

/** output
 * Result using loop: Hell Wrld
 * Result using replaceAll: Hell Wrld */

class PlaceBrackets {

    public static void main(String[] args) {
        String input = "123.456.789";

        String result = placeBrackets(input);

        System.out.println("Original string: " + input);

        System.out.println("Modified string: " + result);
    }

    //  Place brackets around periods in a string - eg, abc.def.ghi becomes abc[.]def[.]ghi
    //     * @param in A String that may contain periods.
    //     * @return a String, but with parentheses around all periods.
    public static String placeBrackets(String in) {
        //StringBuffer class is used to create mutable (modifiable) strings
        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '.') {
                temp.append("[");
                temp.append(in.charAt(i));
                temp.append("]");
            } else {
                temp.append(in.charAt(i));
            }
        }
        return temp.toString();
    }
}
