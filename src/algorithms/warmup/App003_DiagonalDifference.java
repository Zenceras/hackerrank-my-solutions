package algorithms.warmup; /**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
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

public class App003_DiagonalDifference {

    public static void main(String[] args) {
        int[][] arr = {{-10, 3, 0, 5, -4}, {2, -1, 0, 2, -8}, {9, -2, -5, 6, 0}, {9, -7, 4, 8, -2}, {3, 7, 8, -5, 0}};
        System.out.println(diagonalDifference(arr)); //Expected output - 3
    }

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int maxIndex = arr.length - 1;
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            firstDiagonalSum = firstDiagonalSum + arr[i][i];
            secondDiagonalSum = secondDiagonalSum + arr[i][maxIndex];
            maxIndex--;
        }
        if (firstDiagonalSum > secondDiagonalSum) {
            return firstDiagonalSum - secondDiagonalSum;
        } else if (firstDiagonalSum < secondDiagonalSum) {
            return secondDiagonalSum - firstDiagonalSum;
        } else {
            return 0;
        }
    }

    static int diagonalDifference1(int[][] arr) {
        int firstDiagonalSum = arr[0][0] + arr[1][1] + arr[2][2];
        int secondDiagonalSum = arr[0][2] + arr[1][1] + arr[2][0];
        if (firstDiagonalSum > secondDiagonalSum) {
            return firstDiagonalSum - secondDiagonalSum;
        } else if (firstDiagonalSum < secondDiagonalSum) {
            return secondDiagonalSum - firstDiagonalSum;
        } else {
            return 0;
        }
    }

}
