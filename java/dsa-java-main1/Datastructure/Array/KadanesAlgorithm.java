package Array;

public class KadanesAlgorithm {
    /**
     * Finds the maximum sum of a contiguous subarray and prints the subarray indices.
     * Time Complexity: O(n), where n is the size of the array.
     * Space Complexity: O(1), only a constant amount of extra space is used.
     * @param arr The input array.
     * @param n The size of the input array.
     */
    static void maxSubArraySum(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE; // Initialize maximum sum so far
        int currSum = 0; // Initialize current subarray sum
        int start = 0; // Start index of the maximum sum subarray
        int end = 0; // End index of the maximum sum subarray
        int tempStart = 0; // Temporary start index for the current subarray

        // Traverse the array
        for (int i = 0; i < n; i++) {
            currSum += arr[i]; // Add current element to the current subarray sum

            if (maxSum < currSum) {
                maxSum = currSum; // Update maximum sum so far
                start = tempStart; // Update start index of the maximum sum subarray
                end = i; // Update end index of the maximum sum subarray
            }

            if (currSum < 0) {
                currSum = 0; // If current subarray sum is negative, reset it
                tempStart = i + 1; // Update start index for the next potential subarray
            }
        }

        // Print results
        System.out.println("Maximum contiguous sum is " + maxSum);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        maxSubArraySum(arr, n);
    }
}