package Array;

import java.util.Arrays;
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        int arr[] = { 45, 82, 76 }; // Initialize array with values
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.close();

        // Method 1: Linear Search
        int linearSearchIndex = linearSearch(arr, target);
        System.out.println("Linear Search:");
        if (linearSearchIndex != -1) {
            System.out.println("Location of target: " + linearSearchIndex);
        } else {
            System.out.println("Target not found in the array.");
        }

        // Method 2: Binary Search (Assumes sorted array)
        Arrays.sort(arr); // Sorting for binary search
        int binarySearchIndex = binarySearch(arr, target);
        System.out.println("\nBinary Search:");
        if (binarySearchIndex != -1) {
            System.out.println("Location of target: " + binarySearchIndex);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

    // Method 1: Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i; // Return index if target found
            }
        }
        return -1; // Return -1 if target not found
    }

    // Method 2: Binary Search (Assumes sorted array)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Return index if target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if target not found
    }
}
