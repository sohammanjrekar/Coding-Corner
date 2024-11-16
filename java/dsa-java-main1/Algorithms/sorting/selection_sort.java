package Algorithms.Sorting;

import java.util.Arrays;

public class selection_sort {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 11, 5, 78, 10 };
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxindex = getmax(arr, start, last);
            swap(arr, maxindex, last);
        }
    }

    static int getmax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
