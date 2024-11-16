package Array;

import java.util.Arrays;

// Problem: For every index i from 0 to n-1, output the maximum element till index i in the array.
public class maxtilli {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 4, 6, 8 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]); // Update max with the maximum value encountered so far
            arr[i] = max; // Store the maximum value till index i in arr[i]
        }

        System.out.println(Arrays.toString(arr));
    }
}

/*
Time Complexity:
The time complexity of this solution is O(n), where n is the length of the array.
This is because we traverse the array once.

Space Complexity:
The space complexity is O(1) because we use only a constant amount of extra space for variables.

Possible Optimizations:
1. The current implementation is already optimal in terms of time complexity.
2. Ensure edge cases are handled, such as arrays with a single element or all negative numbers.
3. Consider different approaches if additional constraints are introduced, such as modifying the array in place.
*/
