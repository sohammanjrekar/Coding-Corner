package Array;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 8, 7, 8, 8, 6, 2, 1};

        // Method 1: Brute Force
        int bruteForceSecondLargest = bruteForceSecondLargest(nums);
        System.out.println("Brute Force second largest: " + bruteForceSecondLargest);

        // Method 2: Better Optimized
        int betterOptimizedSecondLargest = betterOptimizedSecondLargest(nums);
        System.out.println("Better Optimized second largest: " + betterOptimizedSecondLargest);

        // Method 3: Highly Optimized
        int highlyOptimizedSecondLargest = highlyOptimizedSecondLargest(nums);
        System.out.println("Highly Optimized second largest: " + highlyOptimizedSecondLargest);
    }

    // Method 1: Brute Force
    public static int bruteForceSecondLargest(int[] nums) {
        Arrays.sort(nums); // Sorting the array (O(nlogn))
        int n = nums.length;
        int largest = nums[n - 1];
        int second = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                second = nums[i];
                break;
            }
        }
        return second;
    }

    // Method 2: Better Optimized
    public static int betterOptimizedSecondLargest(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) { // Finding the largest number (O(n))
            if (max < num) {
                max = num;
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) { // Finding the second largest number (O(n))
            if (num != max && num > secondMax) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    // Method 3: Highly Optimized
    public static int highlyOptimizedSecondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums) { // Finding the two largest numbers (O(n))
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
// Method 1 (bruteForceSecondLargest):
// Time Complexity: O(nlogn) due to sorting the array using Arrays.sort(), where n is the number of elements in the array.
// Space Complexity: O(1), as only a constant amount of extra space is used.

// Method 2 (betterOptimizedSecondLargest):
// Time Complexity: O(2n), effectively O(n), as it iterates through the array twice to find the largest and then the second largest number.
// Space Complexity: O(1), as only a constant amount of extra space is used.

// Method 3 (highlyOptimizedSecondLargest):
// Time Complexity: O(n), as it iterates through the array once to find both the largest and the second largest numbers.
// Space Complexity: O(1), as only a constant amount of extra space is used.
