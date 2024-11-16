package Algorithms.Recursion;

import java.util.Arrays;

public class bubble_sort {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 3, 6 };
        bubblesort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubblesort(int[] arr, int len, int i) {
        if (len == 0) {
            return;
        }
        if (i < len) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            bubblesort(arr, len, i + 1);
        } else {
            bubblesort(arr, len - 1, 0);
        }
    }
}
