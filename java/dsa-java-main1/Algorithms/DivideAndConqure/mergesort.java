package Algorithms.DivideAndConqure;

import java.util.Arrays;

/*time complaexity : o(nlogn)
 space complexity: o(n)  
 */
public class mergesort {
    static void merge(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        merge(arr, start, mid);// left
        merge(arr, mid + 1, end);// right
        mergeout(arr, start, mid, end);
    }

    private static void mergeout(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start; // left part iterator
        int j = mid + 1;// right part iterator
        int k = 0;// temp iterator
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // remaining elements in left part
        while (i <= mid) {
            temp[k++] = arr[i++];
            // i++;
            // k++;
        }
        // remaining elements in right part
        while (j <= end) {
            temp[k++] = arr[j++];
            // j++;
            // k++;

        }
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 9, 5, 3, 8 };
        merge(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("Ans is");
        System.out.println(Arrays.toString(arr));
    }
}
