package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {

    // Brute Force Method
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int bruteForce(int[] arr, int k) {
        int maxLength = 0;

        // Traverse the array to find all subarrays
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0; // Initialize the sum for the current subarray
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j]; // Add the current element to the current sum

                // If the current sum equals k, update the maxLength
                if (currentSum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    // Optimized Method using HashMap
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int optimized(int[] arr, int k) {
        int maxLength = 0;
        int currentSum = 0; // Variable to store the cumulative sum
        Map<Integer, Integer> sumToIndex = new HashMap<>(); // Map to store (cumulative sum, index)

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Update the cumulative sum

            // Check if the current cumulative sum equals k
            if (currentSum == k) {
                maxLength = i + 1;
            }

            // Check if there is a previous sum that, when subtracted from the current sum, equals k
            if (sumToIndex.containsKey(currentSum - k)) {
                int startIndex = sumToIndex.get(currentSum - k);
                maxLength = Math.max(maxLength, i - startIndex);
            }

            // Store the cumulative sum in the map if it's not already present
            sumToIndex.putIfAbsent(currentSum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 4; // The target sum K

        // Method 1: Brute Force
        int maxLengthBruteForce = bruteForce(arr, k);
        System.out.println("Longest subarray length with sum " + k + " (Brute Force): " + maxLengthBruteForce);

        // Method 2: Optimized
        int maxLengthOptimized = optimized(arr, k);
        System.out.println("Longest subarray length with sum " + k + " (Optimized): " + maxLengthOptimized);
    }
}

/*
Time Complexity and Space Complexity:

Method 1: Brute Force
- Time Complexity: O(n^2)
  This is because we traverse the array twice: once for the starting index and once for the ending index of the subarray.
- Space Complexity: O(1)
  This is because we are using only a constant amount of extra space.

Method 2: Optimized using HashMap
- Time Complexity: O(n)
  This is because we traverse the array once and perform constant-time operations for each element.
- Space Complexity: O(n)
  This is because we may store the cumulative sum for each element in the array in the map.
*/

