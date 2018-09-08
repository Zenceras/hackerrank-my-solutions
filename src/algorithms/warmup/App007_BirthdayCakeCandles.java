package algorithms.warmup; /**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
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
public class App007_BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int[] workArr = ar;
        Arrays.sort(ar); //Just sort Array
        int result = 1;
        int tmp = workArr[workArr.length - 1];
        for (int i = (workArr.length - 2); i >= 0; i--) { //And count all maximum value duplicates
            if (workArr[i] == tmp) {
                result++;
            }
        }
        return result;
    }
}
