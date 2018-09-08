package algorithms.warmup; /**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 *
 * Created by vlad on 31.08.17.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App006_MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int arrLength = arr.length - 1;
        long[] result = new long[arrLength + 1]; //use long instead int because we have big numbers in tests to this task
        for (int i = 0; i < arr.length; i++) { //each loop excluding 1 array item from sum
            long element = 0;
            for (int z = 0; z < arr.length; z++) {
                if (z != i) { // excluding 1 element from sum each outer loop
                    element = element + arr[z];
                }
            }
            result[i] = element; //put all sums in array
        }
        Arrays.sort(result);
        System.out.println(result[0] + " " + result[arrLength]);
    }
}
