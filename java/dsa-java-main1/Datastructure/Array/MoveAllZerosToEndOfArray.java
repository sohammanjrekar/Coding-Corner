package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MoveAllZerosToEndOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 5, 4, 5, 0, 0, 4, 8};

        // Method 1: Using Two-Pointer Technique
        moveZerosToEnd(arr);
        System.out.println("Method 1 Output: " + Arrays.toString(arr));

        // Method 2: Using Count of Non-Zero Elements
        int[] arr2 = {1, 0, 2, 3, 2, 5, 4, 5, 0, 0, 4, 8};
        moveZerosToEndUsingCount(arr2);
        System.out.println("Method 2 Output: " + Arrays.toString(arr2));

        // Method 3: Using Queue (Alternative Approach)
        int[] arr3 = {1, 0, 2, 3, 2, 5, 4, 5, 0, 0, 4, 8};
        int[] result = moveZerosToEndUsingQueue(arr3);
        System.out.println("Method 3 Output: " + Arrays.toString(result));
    }

    // Method 1: Using Two-Pointer Technique
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void moveZerosToEnd(int[] arr) {
        int count = 0;
        // Traverse through the array with two pointers
        for (int i = 0; i < arr.length; i++) {
            // If current element is not zero, move it to the front
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        // Fill remaining positions with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    // Method 2: Using Count of Non-Zero Elements
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void moveZerosToEndUsingCount(int[] arr) {
        int count = 0;
        // Count non-zero elements and place them at the beginning
        for (int num : arr) {
            if (num != 0) {
                arr[count++] = num;
            }
        }
        // Fill remaining positions with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    // Method 3: Using Queue (Alternative Approach)
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] moveZerosToEndUsingQueue(int[] arr) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();

        // Add non-zero elements to a queue
        for (int num : arr) {
            if (num != 0) {
                queue.add(num);
            }
        }

        // Retrieve elements from queue and place in array
        while (!queue.isEmpty()) {
            arr[count++] = queue.poll();
        }

        // Fill remaining positions with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }

        return arr;
    }
}
