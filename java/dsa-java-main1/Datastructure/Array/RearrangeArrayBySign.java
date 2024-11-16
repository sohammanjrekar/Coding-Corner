package Array;

import java.util.Arrays;

// n/2 positive and n/2 negative
public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int[] ans=new int[arr.length];
        int len=arr.length;
        int p=len/2;
        int n=0;
//         for (int i : arr) {
//             if(i>0){
// ans[p]=i;
// p++;
//             }else{
//                 ans[n]=i;
//                 n++; 
//             }
//         }
// System.out.println(Arrays.toString(ans));
rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
















    public static void rearrangeArray(int[] arr) {
        int len = arr.length;
        int negativeIndex = 0;

        // First pass: Move all negative numbers to the front
        for (int i = 0; i < len; i++) {
            if (arr[i] < 0) {
                swap(arr, negativeIndex, i);
                negativeIndex++;
            }
        }

        // No need for a second pass for positive numbers as they are already in place
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
