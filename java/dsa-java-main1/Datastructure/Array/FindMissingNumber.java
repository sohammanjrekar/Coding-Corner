package Array;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5}; // Given array with one missing number
        int N = 5; // The expected length of the sequence (1 to N)

        // Method 1: Using the sum formula
        int missingNumberUsingSum = findMissingNumberUsingSum(arr, N);
        System.out.println("Missing Number using sum formula: " + missingNumberUsingSum);

        // Method 2: Using XOR
        int missingNumberUsingXOR = findMissingNumberUsingXOR(arr, N);
        System.out.println("Missing Number using XOR: " + missingNumberUsingXOR);
    }

    /**
     * Method to find missing number using sum formula.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMissingNumberUsingSum(int[] arr, int N) {
        int sum = (N * (N + 1)) / 2; // Calculate the sum of the first N natural numbers
        int sumarr = 0; // Calculate the sum of the elements in the array
        for(int n : arr) {
            sumarr += n;
        }
        return sum - sumarr; // The missing number is the difference between the expected sum and the actual sum
    }

    /**
     * Method to find missing number using XOR.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMissingNumberUsingXOR(int[] arr, int N) {
        int xor1 = 0, xor2 = 0;
        // XOR all numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xor1 ^= i;
        }
        // XOR all numbers in the array
        for(int num : arr) {
            xor2 ^= num;
        }
        return xor1 ^ xor2; // The missing number is the XOR of xor1 and xor2
    }
}
