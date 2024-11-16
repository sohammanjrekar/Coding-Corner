package Algorithms.Bitwisealgo;

public class singlenum3 {
    public static void main(String[] args) {
        // Define the input array
        int[] nums = new int[]{2, 4, 1, 2, 3, 5, 5, 1};

        // Initialize variables
        int right = 0, xor = 0, b1 = 0, b2 = 0;

        // XOR all numbers to get the XOR of the two unique numbers
        for (int n : nums) {
            xor ^= n;
        }

        // Find the rightmost set bit in xor
        right = (xor & (xor - 1)) ^ xor;

        // Divide numbers into two groups based on the rightmost set bit and XOR each group
        for (int num : nums) {
            if ((num & right) != 0) { // Check if the bit is set
                b1 ^= num;
            } else {
                b2 ^= num;
            }
        }

        // Print the two unique numbers
        System.out.println("ans = " + b1 + " : " + b2);
    }
}
