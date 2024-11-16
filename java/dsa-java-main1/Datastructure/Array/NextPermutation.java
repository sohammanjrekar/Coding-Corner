package Array;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        // Step 1: Find the largest index i such that arr[i] < arr[i + 1]
        int i;
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) break;
        }

        if (i >= 0) {
            // Step 2: Find the largest index j such that arr[i] < arr[j]
            int j;
            for (j = n - 1; j > i; j--) {
                if (arr[j] > arr[i]) break;
            }

            // Step 3: Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Step 4: Reverse the sub-array from i + 1 to the end
        reverse(arr, i + 1, n - 1);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        for (; start < end; start++, end--) {
            swap(arr, start, end);
        }
    }
}

// time complexity: O(n)
// space complexity: O(1)
