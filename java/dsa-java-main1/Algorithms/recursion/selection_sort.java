package Algorithms.Recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 8, 2, 3 };
        selectionsort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionsort(int[] arr, int len, int i, int max) {

        if (len == 0) {
            return;
        }
        if (i < len) {
            if (arr[i] > arr[max]) {
                selectionsort(arr, len, i + 1, i);

            } else {
                selectionsort(arr, len, i + 1, max);
            }

        } else {
            System.out.println(arr[max] + "max");
            System.out.println(len - 1 + "len");
            int temp = arr[max];
            arr[max] = arr[len - 1];
            arr[len - 1] = temp;
            selectionsort(arr, len - 1, 0, 0);
        }
    }
}
