package algorithms.warmup; /**
 * https://www.hackerrank.com/challenges/plus-minus/problem
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
import java.text.DecimalFormat;
public class App004_PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positiveNumbersCounter = 0;
        double negativeNumbersCounter = 0;
        double zerosCounter = 0;
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] > 0) {positiveNumbersCounter++;}
            if (arr[i] < 0) {negativeNumbersCounter++;}
            if (arr[i] == 0) {zerosCounter++;}
        }
        // double roundOff = Math.round(a * 100.0) / 100.0; /round to 0.01
        double positivesFraction = positiveNumbersCounter / arrayLength;
        double negativesFraction = negativeNumbersCounter / arrayLength;
        double zerosFraction = zerosCounter / arrayLength;

        // round results:
        // double roundOff = Math.round(a * 100.0) / 100.0; //round to 0.01

        // System.out.println(Math.round(positivesFraction * 1000000.0) / 1000000.0);
        // System.out.println(Math.round(negativesFraction * 1000000.0) / 1000000.0);
        // System.out.println(Math.round(zerosFraction * 1000000.0) / 1000000.0);

        // Or use DecimalFormat to format results:
        DecimalFormat df = new DecimalFormat("##.000000");
        System.out.println(df.format(positivesFraction));
        System.out.println(df.format(negativesFraction));
        System.out.println(df.format(zerosFraction));
    }
}
