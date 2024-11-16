package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
   public static void main(String[] args) {
    int[] arr=new int[]{2,6,5,8,11};
    int target=14;
    // time complexity : O(n^2)
    // space complexity : O(1)
    // for(int i=0;i<arr.length;i++){
    //     for (int j = i; j < arr.length; j++) {
    //         if(arr[i]+arr[j]==target) System.out.println("Sum of arr "+target+" : "+arr[i]+" "+arr[j]);
    //     }
    // }

// Initialize a HashMap to store elements of the array and their corresponding values needed to reach the target sum
Map<Integer, Integer> hm = new HashMap<>();

// Iterate through each element in the array
for (int num : arr) {
    // Check if the HashMap contains a value that, when added to the current element, equals the target
    if (hm.containsKey(num)) {
        // If such a value exists, print the two numbers that sum up to the target
        System.out.println("Sum of arr " + target + " : " + num + " " + hm.get(num));
    }
    // Add the current element and its corresponding value needed to reach the target to the HashMap
    hm.put(target - num,num);
}

// Time complexity: O(n)
// Space complexity: O(n)

        // Sort the array
        Arrays.sort(arr);

        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;

        // Iterate through the array using two pointers
        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the sum of the elements at the two pointers equals the target
            if (sum == target) {
                // If such a value exists, print the two numbers that sum up to the target
                System.out.println("Sum of arr " + target + " : " + arr[left] + " " + arr[right]);
                left++;
                right--;
            } else if (sum < target) {
                // If the sum is less than the target, move the left pointer to the right
                left++;
            } else {
                // If the sum is greater than the target, move the right pointer to the left
                right--;
            }
        }

        // Time complexity: O(n log n) due to sorting
        // Space complexity: O(1) as no extra space is used except for the pointers

   }
}
