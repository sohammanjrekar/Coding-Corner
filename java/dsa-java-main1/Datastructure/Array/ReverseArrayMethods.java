package Array;

import java.util.*;

public class ReverseArrayMethods {
    public static void main(String[] args) {
        int arr[] = {45, 82, 76}; // Given array

        // Method 1: Iterative Approach
        System.out.println("Before (Iterative): " + Arrays.toString(arr));
        reverseIterative(arr);
        System.out.println("After (Iterative): " + Arrays.toString(arr));

        // Method 2: Recursive Approach
        System.out.println("Before (Recursive): " + Arrays.toString(arr));
        reverseRecursive(arr, 0, arr.length - 1);
        System.out.println("After (Recursive): " + Arrays.toString(arr));

        // Method 3: Using Collections.reverse() (for Integer Array)
        Integer arr2[] = {45, 82, 76}; // Given array (using Integer for Collections.reverse())
        System.out.println("Before (Collections.reverse()): " + Arrays.toString(arr2));
        reverseUsingCollections(arr2);
        System.out.println("After (Collections.reverse()): " + Arrays.toString(arr2));
    }

    // Method 1: Iterative Approach
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    static void reverseIterative(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // Method 2: Recursive Approach
    // Time Complexity: O(n)
    // Auxiliary Space: O(n) due to recursion stack
    static void reverseRecursive(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRecursive(arr, start + 1, end - 1);
    }

    // Method 3: Using Collections.reverse() (for Integer Array)
    // Time Complexity: O(n)
    // Auxiliary Space: O(1) for the Integer array itself, but additional space for converting to/from List
    static void reverseUsingCollections(Integer arr[]) {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        Collections.toArray(list, arr);
    }
}
