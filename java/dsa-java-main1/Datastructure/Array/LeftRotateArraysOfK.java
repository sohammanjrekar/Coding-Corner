package Array;

import java.util.Arrays; // Import Arrays to print the array

public class LeftRotateArraysOfK {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int rotateBy = 2; // Number of positions to rotate

        // Ensure rotateBy is within the bounds of the array length
        rotateBy = rotateBy % array.length;

        // Store the first rotateBy elements in a temporary array
        // Time Complexity: O(rotateBy)
        // Space Complexity: O(rotateBy)
        int[] tempArray = new int[rotateBy];
        for (int index = 0; index < rotateBy; index++) {
            tempArray[index] = array[index];
        }

        // Shift the remaining elements of the array to the left
        // Time Complexity: O(n - rotateBy)
        // Space Complexity: O(1)
        for (int index = rotateBy; index < array.length; index++) {
            array[index - rotateBy] = array[index];
        }

        // Copy the stored rotateBy elements back to the end of the array
        // Time Complexity: O(rotateBy)
        // Space Complexity: O(rotateBy)
        for (int index = 0; index < rotateBy; index++) {
            array[array.length - rotateBy + index] = tempArray[index];
        }

        // Print the rotated array
        System.out.println(Arrays.toString(array));
    }
}
