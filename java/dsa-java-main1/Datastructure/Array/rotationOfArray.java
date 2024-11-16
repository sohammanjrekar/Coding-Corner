package Array;

import java.util.Arrays;

public class rotationOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3; // No. of rotations

        System.out.println("Given array is ");
        System.out.println(Arrays.toString(arr));

        // Method 1: Rotate using Temp Variable (Time: O(n), Space: O(1))
        rotateWithTempVariable(arr);
        System.out.println("\nRotated array using temp variable: ");
        System.out.println(Arrays.toString(arr));

        // Method 2: Rotate using Reverse Algorithm (Time: O(n), Space: O(1))
        rotateWithReverseAlgorithm(arr);
        System.out.println("\nRotated array using reverse algorithm: ");
        System.out.println(Arrays.toString(arr));
    }

    // Method 1: Rotate using Temp Variable
    public static void rotateWithTempVariable(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    // Method 2: Rotate using Reverse Algorithm
    public static void rotateWithReverseAlgorithm(int[] arr) {
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - 2);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
