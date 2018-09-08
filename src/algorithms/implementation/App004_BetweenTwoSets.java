package algorithms.implementation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 *
 * Created by vlad on 01.09.17.
 */
public class App004_BetweenTwoSets {
    public static void main(String[] args) {
        System.out.println(getTotalX(new int[]{2, 4}, new int[]{16, 32, 96})); //Result should be 3
        System.out.println(getTotalX(new int[]{2}, new int[]{20, 30, 12})); //Result should be 1

    }

    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int integersBetween = 0;
        int maxA = a[a.length - 1];
        int minB = b[0];

        factorCheck:
        for (int i = maxA; i <= minB; i++) {
            for (int intA : a) { //select factors from array a
                if (i % intA != 0) {
                    continue factorCheck;
                }
            }
            for (int intB : b) { //select factors from array b, that previously selected for a
                if ((intB % i) != 0) {
                    continue factorCheck;
                }
            }
            integersBetween++;
        }
        return integersBetween;
    }
}
