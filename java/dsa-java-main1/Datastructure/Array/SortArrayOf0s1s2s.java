package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SortArrayOf0s1s2s {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 0, 0, 1, 0, 0, 1, 2, 0};

        Queue<Integer> q = new LinkedList<>();
        int c0 = 0, c1 = 0, c2 = 0;

        // Count occurrences of 0s, 1s, and 2s
        for (int i : arr) {
            if (i == 0) c0++;
            else if (i == 1) c1++;
            else c2++;
        }

        // Fill the queue with sorted 0s, 1s, and 2s
        while (c0 > 0 || c1 > 0 || c2 > 0) {
            if (c0 > 0) {
                q.add(0);
                c0--;
            } else if (c1 > 0) {
                q.add(1);
                c1--;
            } else if (c2 > 0) {
                q.add(2);
                c2--;
            }
        }

        Integer[] sortedArray = q.toArray(new Integer[0]);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
// optimised  this using duch national flag
sortColors(arr);

System.out.println(Arrays.toString(arr));
    }

  public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        if (i != j) { // Check if indices are different to avoid unnecessary operations
            nums[i] = nums[i] ^ nums[j]; // nums[i] = nums[i] XOR nums[j]
            nums[j] = nums[i] ^ nums[j]; // nums[j] = (nums[i] XOR nums[j]) XOR nums[j] = nums[i]
            nums[i] = nums[i] ^ nums[j]; // nums[i] = (nums[i] XOR nums[j]) XOR nums[i] = nums[j]
        }
    }
    
    
}
