package GreedyMethodology;

import java.util.Arrays;

public class MinimumNumberOfPlatformsRequiredInRailwayStation {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findPlatform(arrival, departure);
        System.out.println("Minimum number of platforms required: " + result);
    }

    public static int findPlatform(int[] arr, int[] dep) {
        // Sort arrival and departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int platform_needed = 1, max_platforms = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process all events in sorted order
        while (i < n && j < n) {
            // If next event in sorted order is arrival, increment count of platforms needed
            if (arr[i] <= dep[j]) {
                platform_needed++;
                i++;
            } else { // Else decrement count of platforms needed
                platform_needed--;
                j++;
            }
            // Update result if needed
            if (platform_needed > max_platforms) {
                max_platforms = platform_needed;
            }
        }
        return max_platforms;
    }
}
