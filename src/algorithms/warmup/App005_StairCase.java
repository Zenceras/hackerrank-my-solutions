package algorithms.warmup; /**
 * https://www.hackerrank.com/challenges/staircase/problem
 *
 * Created by vlad on 31.08.17.
 */
//public class algorithms.warmup.App005_StairCase {
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App005_StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        int k = 1; //counter for "#"
        int z = n - 1; //counter for " "
        for (int h = n; h > 0; h--) { //Height of starcase = n
            for (int i = z; i > 0; i--) { //Print n-1: " "
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) { //Print and n-(n-1): "#". k = n-(n-1)
                System.out.print("#");
            }
            k++;
            z--;
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

