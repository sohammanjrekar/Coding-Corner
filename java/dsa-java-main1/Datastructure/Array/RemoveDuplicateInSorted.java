package Array;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveDuplicateInSorted {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 2, 3, 4, 4, 5, 5, 5};
        int curr = -1;
        Queue<Integer> ans = new LinkedList<>();

        // Iterate through the sorted array to find unique elements
        for (int num : nums) {
            if (num != curr) {
                curr = num;
                ans.add(num); // Add unique element to the queue
            }
        }

        // Print the queue containing unique elements
        System.out.println(ans);
    }
}
