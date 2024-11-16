package Array;

public class MaximumConsecutiveOnes {

    // Method to find maximum consecutive ones using a single pass
    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0; // Variable to count consecutive ones
        int max = 0;   // Variable to store the maximum consecutive ones found

        // Traverse the array to find the maximum consecutive ones
        for (int n : arr) {
            if (n == 1) {
                count++; // Increment count for consecutive ones
                max = Math.max(max, count); // Update max if current count is larger
            } else {
                count = 0; // Reset count when encountering a zero
            }
        }

        return max;
    }

    // Method to find maximum consecutive ones using splitting by zeros
    public static int findMaxConsecutiveOnesBySplit(int[] arr) {
        int max = 0;   // Variable to store the maximum consecutive ones found
        int current = 0; // Variable to count consecutive ones in current segment

        // Traverse the array to find the maximum consecutive ones
        for (int n : arr) {
            if (n == 1) {
                current++; // Increment count for consecutive ones
                max = Math.max(max, current); // Update max if current count is larger
            } else {
                current = 0; // Reset count when encountering a zero
            }
        }

        return max;
    }

    // Method to find maximum consecutive ones using streams (Java 8+)
    // public static int findMaxConsecutiveOnesWithStreams(int[] arr) {
    //     // Convert array to stream, map each element to 1 if it's 1, otherwise to 0,
    //     // then collect into a string, split by 0s, and find the maximum length of segments
    //     return java.util.Arrays.stream(arr)
    //             .mapToObj(String::valueOf)
    //             .collect(java.util.stream.Collectors.joining())
    //             .split("0+")
    //             .length
    //             .max()
    //             .orElse(0);
    // }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 0, 1, 1};

        // Method 1: Using a single pass
        int max1 = findMaxConsecutiveOnes(arr);
        System.out.println("Maximum consecutive ones (Method 1): " + max1);

        // Method 2: Using splitting by zeros
        int max2 = findMaxConsecutiveOnesBySplit(arr);
        System.out.println("Maximum consecutive ones (Method 2): " + max2);

        // Method 3: Using streams (Java 8+)
    //     int max3 = findMaxConsecutiveOnesWithStreams(arr);
    //     System.out.println("Maximum consecutive ones (Method 3): " + max3);
    }
}

/*
Time Complexity:
- Method 1 (Single Pass): O(n), where n is the length of the array. We traverse the array once to find the maximum consecutive ones.
- Method 2 (Splitting by Zeros): O(n), where n is the length of the array. We traverse the array once to count consecutive ones and reset on encountering zeros.
- Method 3 (Using Streams): O(n), where n is the length of the array. Stream operations involve a single pass through the array.

Space Complexity:
- Method 1 (Single Pass): O(1), as we use only a constant amount of extra space for variables.
- Method 2 (Splitting by Zeros): O(1), as we use only a constant amount of extra space for variables.
- Method 3 (Using Streams): O(n), due to additional space used by stream operations.

Possible Optimizations:
1. The current implementations (Methods 1, 2, and 3) are already optimal in terms of time complexity for finding maximum consecutive ones.
2. Ensure edge cases are handled, such as arrays with all zeros or a single element.
3. Consider different approaches if additional constraints are introduced, such as modifying the array in place.
*/
