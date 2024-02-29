package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;

import static org.example.Example.countStatic;

public class Main {
    public static void main(String[] args) {

        // what is being printed in console
        String ss1 = "hello";
        String ss2 = " world";
        ss1.concat(ss2);
        System.out.println(ss1);
        String s3 = ss1.concat(ss2);
        System.out.println(s3);
    }
}

// From Revature test
class Example {

    public static int countStatic = 0;
    public int count = 0;

    public static void main(String[] args) {

        // what is being printed in console
        Example e1 = new Example();
        Example e2 = new Example();
        e1.increment();
        e2.increment();
        System.out.println(e1.count);
        System.out.println(e2.count);
        System.out.println(countStatic);

        // what is being printed in console
        String[] arr = {"foo", "bar", "foobar", "baz"};
        for (int i = 0; i < arr.length; i++) {
            //System.out.println("arr[i].length()= " + arr[i].length());
            if (i > 1 && arr[i].length() > 3) {
                //System.out.println("arr[i].length()= " + arr[i].length());
                System.out.println(arr[i]);
            }
        }

    }

    public void increment() {
        count++;
        countStatic++;
    }
}

