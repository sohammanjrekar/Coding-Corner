package GreedyMethodology;

import java.util.Arrays;

public class ShortestJobFirst {
    public static void main(String[] args) {
        int[] jobs = {4, 3, 7, 1, 2}; // Array representing the processing times of different jobs.
        Arrays.sort(jobs); // Sort jobs in ascending order of their processing times.

        int n = jobs.length; // Number of jobs.
        int[] ans = new int[n]; // Array to store the sorted jobs.
        int totalTime = 0, waitingTime = 0; // Initialize total processing time and waiting time.

        // Compute waiting times and total processing times.
        for (int i = 0; i < n; i++) {
            waitingTime += totalTime; // Add the current total processing time to waiting time.
            totalTime += jobs[i]; // Update total processing time with the current job's processing time.
            ans[i] = jobs[i]; // Store the sorted job in the answer array.
        }

        double averageWaitingTime = (double) waitingTime / n; // Calculate average waiting time.

        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Job execution order: " + Arrays.toString(ans));
    }
}

/*
Time Complexity: O(n log n)
- Sorting the jobs array takes O(n log n) time.
- The for loop runs in O(n) time.

Space Complexity: O(n)
- The additional space used is for the sorted jobs array.
*/
