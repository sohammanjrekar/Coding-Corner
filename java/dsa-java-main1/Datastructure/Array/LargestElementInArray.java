package Array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 7, 6, 2, 1};

        // Method 1: Brute Force
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        findLargestElementBruteForce(nums);

        // Method 2: Sorting
        // Time Complexity: O(n log n) due to sorting
        // Space Complexity: O(1) if using in-place sorting, O(n) otherwise
        findLargestElementSorting(nums);

        // Method 3: Linear Scan with Two Variables
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        findLargestElementLinearScan(nums);
    }

    /**
     * Method 1: Brute Force
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void findLargestElementBruteForce(int[] nums) {
        int max = nums[0]; // Initialize max to the first element of the array

        for (int num : nums) {
            if (num > max) {
                max = num; // Update max if a larger element is found
            }
        }

        System.out.println("Largest number (Brute Force): " + max);
    }

    /**
     * Method 2: Sorting
     * Time Complexity: O(n log n) due to sorting
     * Space Complexity: O(1) if using in-place sorting, O(n) otherwise
     */
    public static void findLargestElementSorting(int[] nums) {
        // Clone the array to avoid modifying the original array
        int[] sortedNums = nums.clone();
        java.util.Arrays.sort(sortedNums);

        int largest = sortedNums[nums.length - 1];
        System.out.println("Largest number (Sorting): " + largest);
    }

    /**
     * Method 3: Linear Scan with Two Variables
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void findLargestElementLinearScan(int[] nums) {
        int max = nums[0]; // Initialize max to the first element of the array

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // Update max if a larger element is found
            }
        }

        System.out.println("Largest number (Linear Scan): " + max);
    }
}
