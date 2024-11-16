package Algorithms.Sorting;

import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 2 };
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i] - 1;
            if (arr[i] != arr[i] - 1) {
                swap(arr, value, i);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
