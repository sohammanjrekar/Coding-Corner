package GreedyMethodology;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = { {1, 2}, {2, 3}, {3, 4}, {1, 3} };
        Result result = eraseOverlapIntervals(intervals);
        System.out.println("Minimum number of intervals to remove: " + result.count);

        System.out.println("Intervals to remove:");
        for (int[] interval : result.intervalsToRemove) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static Result eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return new Result(0, new int[0][0]); // No intervals to remove
        }

        // Sort intervals based on end times
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0; // Count of intervals to remove
        int end = intervals[0][1]; // End time of the last added interval

        // List to store the intervals that need to be removed
        List<int[]> toRemove = new ArrayList<>();

        // Iterate through the intervals starting from the second one
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                // Overlapping interval, increment count and add to the remove list
                count++;
                toRemove.add(intervals[i]);
            } else {
                // Non-overlapping interval, update end time
                end = intervals[i][1];
            }
        }

        // Convert list to array
        int[][] removeArray = new int[toRemove.size()][2];
        for (int i = 0; i < toRemove.size(); i++) {
            removeArray[i] = toRemove.get(i);
        }

        return new Result(count, removeArray); // Return the count and intervals to remove
    }

    // Custom class to hold the result
    static class Result {
        int count;
        int[][] intervalsToRemove;

        Result(int count, int[][] intervalsToRemove) {
            this.count = count;
            this.intervalsToRemove = intervalsToRemove;
        }
    }
}
