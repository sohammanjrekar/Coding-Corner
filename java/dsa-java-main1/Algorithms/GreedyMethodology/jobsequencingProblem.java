package GreedyMethodology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class jobsequencingProblem {
    static class Job {
        int deadline;
        int profit;
        int id;// 0,1,2

        Job(int deadline, int profit, int id) {
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        int[][] jobsinfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsinfo.length; i++) {
            jobs.add(new Job (jobsinfo[i][0], jobsinfo[i][1],i));
        }

        // Collections.sort(jobs, (a,b)->a.profit-b.profit);//ascending
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);// descending

        int time = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                ans.add(curr.id);
                time++;
            }
        }
        System.out.println(ans);
    }
}
