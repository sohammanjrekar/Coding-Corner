package Array;

import java.util.*;
// time O(nlogn)
//Space Complexity: O(n)

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};
        
        // Sorting the intervals based on the start time and then by the end time
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
        System.out.print("All Intervals: ");
        // Printing the sorted intervals, each on a new line
        for (int[] interval : arr) {
            System.out.print(Arrays.toString(interval));
        }
        System.out.println();
        // Merging the intervals
        List<int[]> ans = new ArrayList<>();
        int[] currentInterval = arr[0];
        ans.add(currentInterval);
        
        for (int i = 1; i < arr.length; i++) {
            int[] interval = arr[i];
            int currentEnd = currentInterval[1];
            
            if (interval[0] <= currentEnd) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, interval[1]);
            } else {
                // No overlap, add the interval to the list
                currentInterval = interval;
                ans.add(currentInterval);
            }
        }
        System.out.println();
        System.out.print("Merge Overlapping: ");
        // Printing the merged intervals
        for (int[] interval : ans) {
            System.out.print(Arrays.toString(interval));
        }
    }
}
