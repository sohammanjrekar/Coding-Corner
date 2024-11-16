package Array;

import java.util.Arrays;

public class SumOfSubarray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // Method 1: Brute Force
        bruteForceSumOfSubarray(arr);

        // Method 2: Prefix Sums
        prefixSumSubarray(arr);

        // Method 3: Sliding Window (Optimized)
        slidingWindowSubarray(arr);
    }

    /**
     * Method 1: Brute Force approach to find sum of all subarrays.
     * Time Complexity: O(n^3) - We generate all possible subarrays (O(n^2)) and calculate sum for each subarray.
     * Space Complexity: O(1) - Only constant space used.
     */
    public static void bruteForceSumOfSubarray(int[] arr) {
        int n = arr.length;
        // Iterate over all possible subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                System.out.println("Subarray from index " + start + " to " + end + ": Sum = " + sum);
            }
        }
    }

    /**
     * Method 2: Using Prefix Sums to find sum of all subarrays.
     * Time Complexity: O(n^2) - We calculate prefix sums in O(n) time and then compute each subarray sum in O(1) time using these prefix sums.
     * Space Complexity: O(n) - Extra space used for the prefix sum array.
     */
    public static void prefixSumSubarray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        // Compute prefix sums
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        // Calculate subarray sums using prefix sums
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                int sum = prefixSum[end] - prefixSum[start];
                System.out.println("Subarray from index " + start + " to " + (end - 1) + ": Sum = " + sum);
            }
        }
    }

    /**
     * Method 3: Using Sliding Window (Optimized) to find sum of all subarrays.
     * Time Complexity: O(n^2) - Similar to brute force, as it iterates over all possible subarrays.
     * Space Complexity: O(1) - Only constant space used.
     */
    public static void slidingWindowSubarray(int[] arr) {
        int n = arr.length;
        int sum = 0;

        // Calculate sum of all subarrays using sliding window
        for (int start = 0; start < n; start++) {
            sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                System.out.println("Subarray from index " + start + " to " + end + ": Sum = " + sum);
            }
        }
    }
}
