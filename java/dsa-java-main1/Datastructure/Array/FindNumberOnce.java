package Array;

import java.util.Arrays;

public class FindNumberOnce {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3, 4, 5, 4, 5};

        // Method 1: Using a count array (inefficient for larger numbers)
        findNumberUsingCountArray(nums);

        // Method 2: Using XOR (efficient approach)
        findNumberUsingXOR(nums);
    }

    /**
     * Method 1: Find number using a count array.
     * Time Complexity: O(n + m)
     * Space Complexity: O(m)
     */
    public static void findNumberUsingCountArray(int[] nums) {
        int[] count = new int[maxElement(nums) + 1]; // Create a count array based on the maximum element
        for (int num : nums) {
            count[num]++;
        }

        // Find the number that appears only once
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.println("Number appearing once using count array: " + i);
                break;
            }
        }
    }

    /**
     * Helper method to find the maximum element in the array.
     */
    private static int maxElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Method 2: Find number using XOR.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void findNumberUsingXOR(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        System.out.println("Number appearing once using XOR: " + xor);
    }
}
