import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr) {
        int n = arr.length;

        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            // Find the correct position for the item
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) pos++;
            }

            // Skip if already in correct position
            if (pos == cycleStart) continue;

            // Place the item in the correct position
            while (item == arr[pos]) pos++;
            if (item != arr[pos]) {
                item = swap(arr, pos, item);
            }

            // Rotate the rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) pos++;
                }
                while (item == arr[pos]) pos++;
                if (item != arr[pos]) {
                    item = swap(arr, pos, item);
                }
            }
        }
    }

    // Swap function to swap the current item with the array element at position
    private static int swap(int[] arr, int pos, int item) {
        int temp = arr[pos];
        arr[pos] = item;
        return temp;
    }
}
