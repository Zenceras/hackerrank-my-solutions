package algorithms.warmup; /**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
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

public class App002_VeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (int i = 0; i < ar.length; i++) {
            result = result + ar[i];
        }
        return result;
    }
}