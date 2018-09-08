package algorithms.warmup; /**
 * Compare the Triplets
 *
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 *
 * Created by vlad on 31.08.17.
 */

import java.util.*;

public class App001_CompareTheTriplets {

    public static void main(String[] args) {
        System.out.println(compareTriplets(new ArrayList<Integer>(Arrays.asList(5, 6, 7)),
                new ArrayList<Integer>(Arrays.asList(3, 6, 10)))); //Expected output: 1 1

        System.out.println(compareTriplets(new ArrayList<Integer>(Arrays.asList(17, 28, 30)),
                new ArrayList<Integer>(Arrays.asList(99, 16, 8)))); //Expected output: 2 1
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {throw new IllegalArgumentException("a.size() != b.size()");}
        if (a == null && b == null) {throw new IllegalArgumentException("a == null && b == null");}
        List<Integer> result = new ArrayList();
        int tmp = 0;
        // result.set(0, 0);
        // result.set(1, 0);
        result.add(0);
        result.add(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == b.get(i)) {
                //none
            } else if (a.get(i) > b.get(i)){
                tmp = result.get(0);
                tmp++;
                result.set(0, tmp);
            } else if (a.get(i) < b.get(i)){
                tmp = result.get(1);
                tmp++;
                result.set(1, tmp);
            } else {
                throw new IllegalArgumentException("Noncomparable lists");
            }
        }
        return result;
    }
}
