package GreedyMethodology;

import java.util.Arrays;
import java.util.Comparator;

public class MaxlengthChainofpairs {
    public static void main(String[] args) {
        int[][] list = { { 5, 24 },
                { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(list, Comparator.comparingDouble(o -> o[1]));
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        int chainlength = 1;
        int lastPairend = list[0][1];
        for (int i = 0; i < list.length; i++) {
            if (list[i][0] > lastPairend) {
                chainlength += 1;
                lastPairend = list[i][1];
            }
        }
        System.out.println(chainlength);
    }
}
