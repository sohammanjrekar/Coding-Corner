package Array;

import java.util.Arrays;

public class MergeSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        
        merge(arr1, arr2);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        
        // Traverse from the end of arr1 and the beginning of arr2
        for (int i = n - 1, j = 0; i >= 0 && j < m; i--, j++) {
            if (arr1[i] > arr2[j]) {
                // Swap arr1[i] and arr2[j]
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            } else {
                // As arr1 and arr2 are sorted, no need to continue if arr1[i] <= arr2[j]
                break;
            }
        }
        
        // Sort arr1 and arr2 again to ensure they are individually sorted
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
























// package Array;

// import java.util.Arrays;

// public class MergeSortedArraysWithoutExtraSpace {
//     public static void main(String[] args) {
//         int[] arr1 = {1, 3, 5, 7};
//         int[] arr2 = {0, 2, 6, 8, 9};
        
//         int[] mergedArray = merge(arr1, arr2);

//         System.out.println("Merged array: " + Arrays.toString(mergedArray));
//     }

//     private static int[] merge(int[] arr1, int[] arr2) {
//         int n = arr1.length;
//         int m = arr2.length;
//         int[] mergedArray = new int[n + m];
        
//         int i = 0, j = 0, k = 0;
        
//         // Traverse both arrays and store the smallest element into the merged array
//         while (i < n && j < m) {
//             if (arr1[i] <= arr2[j]) {
//                 mergedArray[k++] = arr1[i++];
//             } else {
//                 mergedArray[k++] = arr2[j++];
//             }
//         }
        
//         // Store remaining elements of arr1
//         while (i < n) {
//             mergedArray[k++] = arr1[i++];
//         }
        
//         // Store remaining elements of arr2
//         while (j < m) {
//             mergedArray[k++] = arr2[j++];
//         }
        
//         return mergedArray;
//     }
// }
