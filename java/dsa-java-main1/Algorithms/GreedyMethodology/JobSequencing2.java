package GreedyMethodology;

import java.util.Arrays;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Job{id=" + id + ", deadline=" + deadline + ", profit=" + profit + "}";
    }
}

public class JobSequencing2 {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };

        int n = jobs.length;
        int[] result = jobSequencing(jobs, n);

        System.out.print("Job sequence for maximum profit: ");
        for (int jobId : result) {
            if (jobId != 0) {
                System.out.print("Job" + jobId + " ");
            }
        }

        System.out.println("\nAll jobs data:");
        for (Job job : jobs) {
            System.out.println(job);
        }
    }

    // Function to find the maximum profit sequence of jobs
    public static int[] jobSequencing(Job[] jobs, int n) {
        // Sort jobs in descending order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        int[] result = new int[maxDeadline]; // Array to store the result sequence
        boolean[] slot = new boolean[maxDeadline]; // Array to keep track of free time slots

        Arrays.fill(slot, false); // Initialize all slots to be free

        int maxProfit = 0; // Variable to store the maximum profit

        // Iterate through all given jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (from its deadline to 0)
            for (int j = Math.min(maxDeadline - 1, jobs[i].deadline - 1); j >= 0; j--) {
                // Free slot found
                if (!slot[j]) {
                    result[j] = jobs[i].id; // Add this job to result
                    slot[j] = true; // Mark this slot as occupied
                    maxProfit += jobs[i].profit; // Add the profit
                    break;
                }
            }
        }

        // Print the maximum profit
        System.out.println("\nMaximum profit: " + maxProfit);
        return result; // Return the job sequence
    }
}
