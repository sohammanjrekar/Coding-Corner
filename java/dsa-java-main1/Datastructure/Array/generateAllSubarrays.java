package Array;

public class GenerateAllSubarrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // Given array

        // Method 1: Brute Force - Generate and Print Subarrays
        // Time Complexity: O(n^3) due to nested loops and printing each subarray
        // Space Complexity: O(1) additional space
        generateAndPrintSubarrays(arr);

        // Method 2: Generate Subarrays without Printing
        // Time Complexity: O(n^2) to generate all subarrays without printing
        // Space Complexity: O(1) additional space
        generateSubarraysWithoutPrinting(arr);
    }

    /**
     * Method 1: Brute Force - Generate and Print Subarrays
     * Time Complexity: O(n^3)
     * Space Complexity: O(1)
     */
    public static void generateAndPrintSubarrays(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * Method 2: Generate Subarrays without Printing
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static void generateSubarraysWithoutPrinting(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                // Process each subarray without printing
                // This method can be used if only generating subarrays is required
            }
        }
    }
}
