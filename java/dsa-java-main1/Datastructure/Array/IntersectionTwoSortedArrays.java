package Array;

import java.util.Arrays;

public class IntersectionTwoSortedArrays {
    public static void main(String[] args) {
        // Define two sorted arrays
        int[] arr1 = new int[]{1, 1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 3, 4, 4, 5};

        // Call the function to find intersection
        int[] intersection = findIntersection(arr1, arr2);

        // Print the intersection array
        System.out.println(Arrays.toString(intersection));
    }

    /**
     * Finds the intersection of two sorted arrays.
     * Time Complexity: O(m + n), where m and n are the lengths of arr1 and arr2, respectively.
     * Space Complexity: O(min(m, n)), where m and n are the lengths of arr1 and arr2, respectively.
     * @param arr1 The first sorted array.
     * @param arr2 The second sorted array.
     * @return An array containing the intersection elements.
     */
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        // Traverse both arrays simultaneously to find intersections
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++; // Move pointer in arr1 forward
            } else if (arr1[i] > arr2[j]) {
                j++; // Move pointer in arr2 forward
            } else {
                // Found an intersection element
                // To avoid duplicates in the intersection array
                if (index == 0 || temp[index - 1] != arr1[i]) {
                    temp[index++] = arr1[i]; // Store the intersection element
                }
                i++; // Move both pointers forward
                j++;
            }
        }

        // Copy the intersection elements to the final result array
        int[] result = Arrays.copyOfRange(temp, 0, index);
        return result; // Return the intersection array
    }
}
