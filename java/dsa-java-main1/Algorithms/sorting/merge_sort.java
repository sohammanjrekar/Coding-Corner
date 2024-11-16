package Algorithms.Sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 8, 3, 5 };
        mergesort(arr, arr.length / 2, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr, int mid, int start, int end) {
        if (arr.length == 1) {
            return arr;
        }
        mid = start + (end - start) / 2;

        return arr;
    }
}
