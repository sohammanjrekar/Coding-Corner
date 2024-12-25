import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 4, 3, 2, 1 };

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for each pass
            for (int j = 0; j < arr.length - i - 1; j++) { // Inner loop to compare elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if the current element is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
