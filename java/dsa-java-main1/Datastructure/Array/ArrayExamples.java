package Array;

import java.util.*;

public class ArrayExamples {

    // Utility function to print the contents of an array
    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Function to find the largest element in an array
    static int findLargestElement(int[] nums) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int max = nums[0]; // Initialize max to the first element of the array

        for (int num : nums) {
            if (num > max) {
                max = num; // Update max if a larger element is found
            }
        }
        return max;
    }

    // Function to generate all subarrays of an array
    static void generateAllSubarrays(int[] arr) {
        // Time Complexity: O(n^3)
        // Space Complexity: O(1)
        for (int start = 0; start < arr.length; start++) { // Outer loop for the starting index
            for (int end = start; end < arr.length; end++) { // Inner loop for the ending index
                // Print the subarray from 'start' to 'end'
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Function to find a number that appears only once in an array
    static int findNumberOnce(int[] nums) {
        // Method 2: Using XOR (efficient approach)
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int xor = 0;
        // XOR all elements in the nums array
        for (int num : nums) {
            xor ^= num;
        }
        // The result will be the number that appears only once
        return xor;
    }

    // Function to check if an array is sorted in non-decreasing order
    static boolean checkArraySorted(int[] arr) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        boolean sorted = true;

        // Traverse the array to check if it is sorted
        for (int i = 1; i < arr.length; i++) {
            // If the current element is less than the previous element, the array is not sorted
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break; // Exit the loop early since the array is not sorted
            }
        }
        return sorted;
    }

    // Function to find the missing number in an array of 1 to N
    static int findMissingNumber(int[] arr, int N) {
        // Method 2: Using XOR
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int xor1 = 0, xor2 = 0;
        // XOR all numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xor1 ^= i;
        }
        // XOR all numbers in the array
        for (int num : arr) {
            xor2 ^= num;
        }
        // The missing number is the XOR of xor1 and xor2
        return xor1 ^ xor2;
    }

    // Function to sort an array of 0s, 1s, and 2s (Dutch National Flag problem)
    static void sortArray012(int[] arr) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // Count the number of 0s, 1s, and 2s in the array
        for (i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }

        // Update the array with the counted values
        i = 0;

        // Store all the 0s at the beginning
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        // Store all the 1s next
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        // Store all the 2s at the end
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        // Print the sorted array
        printArr(arr, arr.length);
    }

    // Function to find the longest subarray with sum K
    static int[] findLongestSubarrayWithSumK(int[] arr, int k) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        int maxLength = 0;
        int start = 0; // Starting index of the subarray with sum K
        int end = -1;  // Ending index of the subarray with sum K

        // Map to store (cumulative sum, index)
        // This helps in quickly finding the starting index of the subarray
        Map<Integer, Integer> sumToIndex = new HashMap<>();

        int currentSum = 0; // Variable to store the cumulative sum

        // Traverse the array to find the longest subarray with sum K
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Update the cumulative sum

            if (currentSum == k) {
                // If currentSum equals k, update maxLength, start, and end
                maxLength = i + 1;
                start = 0;
                end = i;
            } else if (sumToIndex.containsKey(currentSum - k)) {
                // If currentSum - k exists in the map, it means there is a subarray with sum k
                int startIndex = sumToIndex.get(currentSum - k);
                int currentLength = i - startIndex;

                // Update maxLength, start, and end if the current subarray is longer
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = startIndex + 1;
                    end = i;
                }
            }

            // Store the first occurrence of each cumulative sum
            if (!sumToIndex.containsKey(currentSum)) {
                sumToIndex.put(currentSum, i);
            }
        }

        // Extract the longest subarray with sum K
        if (end != -1) {
            // Use Arrays.copyOfRange to extract the subarray from start to end
            return Arrays.copyOfRange(arr, start, end + 1);
        } else {
            // Return an empty array if no subarray with sum K is found
            return new int[0];
        }
    }

    // Driver code to test the functions
    public static void main(String[] args) {
        // Example usage of each function
        int[] nums = {4, 5, 8, 7, 6, 2, 1};
        System.out.println("Largest element in nums: " + findLargestElement(nums));

        int[] arr = {1, 2, 3, 4};
        generateAllSubarrays(arr);

        int[] numsOnce = {1, 1, 2, 2, 3, 4, 5, 4, 5};
        System.out.println("Number appearing once using XOR: " + findNumberOnce(numsOnce));

        int[] sortedArray = {2, 5, 4, 2, 5, 1, 3};
        System.out.println("Array sorted in non-decreasing order: " + checkArraySorted(sortedArray));

        int[] arrMissing = {1, 2, 4, 5};
        int N = 5;
        System.out.println("Missing Number using XOR: " + findMissingNumber(arrMissing, N));

        int[] arr012 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortArray012(arr012);
        System.out.println();

        int[] arrSubarray = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 4;
        int[] longestSubarray = findLongestSubarrayWithSumK(arrSubarray, k);
        if (longestSubarray.length > 0) {
            System.out.print("Longest subarray with sum " + k + ": ");
            printArr(longestSubarray, longestSubarray.length);
        } else {
            System.out.println("No subarray found with sum " + k);
        }
    }
}

/*
Summary:

1. findLargestElement Method:
   - Time Complexity: O(n)
   - Space Complexity: O(1)
   - Description: Finds the largest element in an array of integers.

2. generateAllSubarrays Method:
   - Time Complexity: O(n^3)
   - Space Complexity: O(1)
   - Description: Generates and prints all subarrays of an integer array.

3. findNumberOnce Method:
   - Time Complexity: O(n)
   - Space Complexity: O(1)
   - Description: Finds a number that appears only once in an array using XOR.

4. checkArraySorted Method:
   - Time Complexity: O(n)
   - Space Complexity: O(1)
   - Description: Checks if an array of integers is sorted in non-decreasing order.

5. findMissingNumber Method:
   - Time Complexity: O(n)
   - Space Complexity: O(1)
   - Description: Finds the missing number in an array of integers from 1 to N using XOR.

6. sortArray012 Method:
   - Time Complexity: O(n)
   - Space Complexity: O(1)
   - Description: Sorts an array of 0s, 1s, and 2s (Dutch National Flag problem).

7. findLongestSubarrayWithSumK Method:
   - Time Complexity: O(n)
   - Space Complexity: O(n)
   - Description: Finds the longest subarray with sum K in an array of integers.

Driver code in main method demonstrates usage of each function.
*/
