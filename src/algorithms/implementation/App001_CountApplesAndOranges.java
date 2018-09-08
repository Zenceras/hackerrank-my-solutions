package algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 *
 * Created by vlad on 01.09.17.
 */
public class App001_CountApplesAndOranges {

    public static void main(String[] args) {
        countApplesAndOranges(7, 11,  //home coordinates
                              5, 15,  //Apple Tree and Orange Tree cordinates
                              new int[] {-2, 2, 1}, new int[] {5, -6}); //3 apples and 2 oranges coordinates
                              //Output must be: 1 1

        countApplesAndOranges(2, 3,  //home coordinates
                              1, 5,  //Apple Tree and Orange Tree cordinates
                              new int[] {2}, new int[] {-2}); //1 apple and 1 orange coordinates
        //Output must be: 1 1
    }

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesOnHomeCounter = 0;
        int orangesOnHomeCounter = 0;
        for (int ap = 0; ap < apples.length; ap++) { //apples loop
//            System.out.println("s + apples[ap]: " + (a + apples[ap]));
            if ((a + apples[ap]) >= s && (a + apples[ap]) <= t) { //if apple in home range(s-t) - increment apple counter
                applesOnHomeCounter++;
            }
        }

        for (int or = 0; or < oranges.length; or++) { //oranges loop
            if ((b + oranges[or]) >= s && (b + oranges[or]) <= t) { //if orange in home range(s-t) - increment orange counter
                orangesOnHomeCounter++;
            }
        }
        System.out.println(applesOnHomeCounter);
        System.out.println(orangesOnHomeCounter);
    }
}
