import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 4, 3, 2, 1 };

        // Start the loop from index 1
        for (int i = 1; i < arr.length; i++) {
            int j = i;

            // Shift elements to insert arr[i] into its correct position
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
