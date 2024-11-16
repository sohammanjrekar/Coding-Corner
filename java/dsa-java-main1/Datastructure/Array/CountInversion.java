// package Array;

// import java.util.*;

// public class CountInversion {
//    public static void main(String[] args) {
//         int[] arr={5,3,2,4,1};
    
//         List<List<Integer>> ans = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[i]>arr[j]){
//                     List<Integer> temp=new ArrayList<>();
//                     temp.add(arr[i]);
//                     temp.add(arr[j]);
//                     ans.add(temp);
                    
//                 }
//             }
//         }
//         System.out.println("Count Pairs : "+ans.size());
//         System.out.println(ans);
//    }
// }
package Array;

public class CountInversion {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        int n = arr.length;
        int[] temp = new int[n];
        int inversionCount = mergeSortAndCount(arr, temp, 0, n - 1);
        
        System.out.println("Count of inversions: " + inversionCount);
    }

    // Function to use merge sort and count inversions
    private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int mid, invCount = 0;
        if (right > left) {
            mid = (right + left) / 2;

            invCount += mergeSortAndCount(arr, temp, left, mid);
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);

            invCount += mergeAndCount(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    // Function to merge two halves and count inversions
    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; // Starting index for left subarray
        int j = mid;  // Starting index for right subarray
        int k = left; // Starting index to be sorted
        int invCount = 0;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }
}
