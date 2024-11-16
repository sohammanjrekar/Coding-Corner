package Algorithms.GreedyMethodology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelectionUnsorting {
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
        for (int i = 0; i < activites.length; i++) {
            for (int j = 0; j < activites[i].length; j++) {
                System.out.print(activites[i][j] + " ");
            }
            System.out.println();
        }
        // lambda function -> shortform
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct++;
        ans.add(activites[0][0]);
        int lastEnd = activites[0][2];
        for (int i = 1; i < End.length; i++) {
            if (activites[i][1] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }
        System.out.println("max activites : " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
