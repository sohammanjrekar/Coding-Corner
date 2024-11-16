// package Array;

// public class CountSubarraySumEqualsK {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,-3,1,1,1,4,2,-3};
//         int k=3;
//         int curr=0;
//         int count=0;
        
//         for (int i = 0; i < arr.length; i++) {
//             curr=0;
//             for (int j = i; j < arr.length; j++) {
//                 curr+=arr[j];
//                if(curr==k) count++; 
//             }
//         }
//         System.out.println(count);
//     }
// }













package Array;

import java.util.*;

public class CountSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int count = countSubarrays(arr, k);
        System.out.println(count); // Output: 7
    }

    public static int countSubarrays(int[] arr, int k) {
        System.out.println(Arrays.toString(arr));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 having frequency 1
        int count = 0;
        int currSum = 0;

        for (int num : arr) {
            currSum += num;

            // Check if there exists a subarray ending at the current index with sum = k
            if (map.containsKey(currSum - k)) count += map.get(currSum - k);

            // Update the frequency of the current sum in the map
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
