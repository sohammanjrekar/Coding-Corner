public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 2 };
        quickSorts(arr, 0, arr.length - 1);
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSorts(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);
            // Recursively sort the elements on the left and right of the pivot
            quickSorts(arr, low, pivotIndex - 1);
            quickSorts(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1;       // Pointer for the smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Return the pivot index
    }
}
