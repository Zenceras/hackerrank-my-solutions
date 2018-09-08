package algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 *
 * Created by vlad on 01.09.17.
 */
public class App002_Kangaroo {
    public static void main(String[] args) {
//        System.out.println(kangaroo(0, 3, 4, 2)); //Output should be "YES"
//        System.out.println(kangaroo(0, 2, 5, 3));//Output should be "NO"
        System.out.println(kangaroo(4523, 8092, 9419, 8076));//Output should be "YES"
    }

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean flag = false;
        for (int i = 0; i <= 10_000; i++) {
//            System.out.println("x1: " + x1 + " | " + "x2: " + x2);
            if(x1==x2) {
                flag = true;
                break;
            }
            x1 = x1 + v1;
            x2 = x2 + v2;
        }
        if (flag) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
