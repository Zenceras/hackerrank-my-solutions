package algorithms.implementation;

import java.util.Arrays;

/**
 * Created by vlad on 02.09.17.
 */
public class App005_BreakingBestAndWorstRecords {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1}))); //Expected output: 2 4
    }



    static int[] breakingRecords(int[] scores) {
        int hiScore = scores[0];
        int hiScoreCounter = 0;
        int lowScore = scores[0];
        int lowScoreCounter = 0;
        for(int i = 1; i < scores.length; i++) {
            if(scores[i] > hiScore) {
                hiScore = scores[i];
                hiScoreCounter++;
            }
            if(scores[i] < lowScore) {
                lowScore = scores[i];
                lowScoreCounter++;
            }
        }
        int[] result = new int[] {hiScoreCounter, lowScoreCounter};
        return result;
    }
}
