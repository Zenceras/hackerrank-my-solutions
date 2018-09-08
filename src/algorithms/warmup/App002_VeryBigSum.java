package algorithms.warmup; /**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 *
 * Created by vlad on 31.08.17.
 */

public class App002_VeryBigSum {

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(new long[] {1000000001, 1000000002,
                1000000003, 1000000004, 1000000005})); //Expected output: 5000000015
    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (int i = 0; i < ar.length; i++) {
            result = result + ar[i];
        }
        return result;
    }
}