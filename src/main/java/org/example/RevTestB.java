import java.lang.*;
import java.io.*;
import java.util.*;

/** This code first concatenates all the strings in each array to form two separate strings,
 * then compares the two resulting strings. If they are equal, it returns true; otherwise, it returns false.*/

public class RevTestB {

    public static int evenNumbers(int[] A, int N, int X) {

        // WRITE YOUR LOGIC HERE
        int evenNum = 0;

        for (int i=0; i < N; i++) {
            if (A[i] == X) {
                break;
            }
            if (A[i] %2 ==0) {
                evenNum++;
            }
        }

        return evenNum;
    }


    // DO NOT TOUCH THE CODE BELOW
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner(System.in);
        //int N = sc.nextInt();
        //int[] A = new int[N];
        //for(int i=0; i<N; i++) {
        //    A[i] = sc.nextInt();
        //}
        //int X = sc.nextInt();

        int [] A = {1, 7, 5, 3, 8, 9, 4, 6, 3};
        int X = 6;
        int result = evenNumbers(A, A.length, 8);

        System.out.println("Initial array: " + Arrays.toString(A));
        System.out.println("Number of even numbers before " + X + " is " + result);

    }
}