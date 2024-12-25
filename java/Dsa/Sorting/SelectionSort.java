import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Assume the first unsorted element is the smallest
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { // Find the smallest element in the unsorted part
                    min = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted part
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
