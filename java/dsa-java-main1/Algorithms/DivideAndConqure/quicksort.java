package Algorithms.DivideAndConqure;

import java.util.Arrays;

//pivot and partition
/*
 pivot -> random
        median
        first
        last (mostly used)



        worst case occurs when pivot is always smallest or largest element
 */
public class quicksort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quick(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("Ans is");
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // last element
        int pivotidx = partitions(arr, start, end);
        quick(arr, start, pivotidx - 1);
        quick(arr, pivotidx + 1, end);

    }

    private static int partitions(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];// pivot =arr[i]
        arr[i] = temp;
        return i;
    }
}
