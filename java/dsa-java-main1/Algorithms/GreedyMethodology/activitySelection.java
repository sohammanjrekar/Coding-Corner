package Algorithms.GreedyMethodology;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class activitySelection {
    public static void main(String[] args) {
        int Start[] = { 1, 3, 0, 5, 8, 5 };
        int End[] = { 2, 4, 6, 7, 9, 9 };

        // end time is sorted
        int activites[][] = new int[Start.length][3];
        for (int i = 0; i < Start.length; i++) {
            activites[i][0] = i;
            activites[i][1] = Start[i];
            activites[i][2] = End[i];
        }
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct++;
        ans.add(0);
        int lastEnd = End[0];
        for (int i = 1; i < End.length; i++) {
            if (Start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = End[i];
            }
        }
        System.out.println("max activites : " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
