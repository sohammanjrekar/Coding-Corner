package Array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};

        // Method 1: Using Sets to store unique elements (HashSet)
        findUnionUsingSet(arr1, arr2);

        // Method 2: Using Merge Operation (Similar to Merge Sort)
        findUnionUsingMerge(arr1, arr2);

        // Method 3: Using Two-Pointer Technique (Iterative approach)
        findUnionUsingTwoPointers(arr1, arr2);
    }

    /**
     * Method 1: Using Sets to store unique elements (HashSet).
     * Time Complexity: O(m + n), where m and n are the lengths of arr1 and arr2 respectively.
     * Space Complexity: O(m + n) due to the HashSet storing unique elements.
     */
    public static void findUnionUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();
        
        for (int num : arr1) {
            unionSet.add(num);
        }
        
        for (int num : arr2) {
            unionSet.add(num);
        }
        
        System.out.println("Union using HashSet: " + unionSet);
    }

    /**
     * Method 2: Using Merge Operation (Similar to Merge Sort).
     * Time Complexity: O(m + n), where m and n are the lengths of arr1 and arr2 respectively.
     * Space Complexity: O(m + n) for storing elements in the merged array.
     */
    public static void findUnionUsingMerge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                merged[k++] = arr2[j++];
            } else {
                merged[k++] = arr1[i++];
                j++;
            }
        }
        
        while (i < m) {
            merged[k++] = arr1[i++];
        }
        
        while (j < n) {
            merged[k++] = arr2[j++];
        }
        
        System.out.print("Union using Merge: ");
        printArray(merged);
    }

    /**
     * Method 3: Using Two-Pointer Technique (Iterative approach).
     * Time Complexity: O(m + n), where m and n are the lengths of arr1 and arr2 respectively.
     * Space Complexity: O(1), as we do not use any extra space apart from the result.
     */
    public static void findUnionUsingTwoPointers(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        System.out.print("Union using Two Pointers: ");
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        // Print remaining elements of arr1
        while (i < m) {
            System.out.print(arr1[i++] + " ");
        }

        // Print remaining elements of arr2
        while (j < n) {
            System.out.print(arr2[j++] + " ");
        }
        System.out.println();
    }

    // Utility method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
