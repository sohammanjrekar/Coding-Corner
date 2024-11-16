package Array;

import java.util.Arrays;
import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); // Number of positions to left shift
        sc.close();
        int n = arr.length; // Length of the array

        // Left shift the array by d positions
        // Time Complexity: O(n * d)
        // Space Complexity: O(1)
        for (int i = 0; i < d; i++) {
            int temp = arr[0]; // Store the first element temporarily
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1]; // Shift each element to the left by one position
            }
            arr[n - 1] = temp; // Place the stored element at the end of the array
        }

        // Print the left shifted array
        System.out.println(Arrays.toString(arr));
    }
}
