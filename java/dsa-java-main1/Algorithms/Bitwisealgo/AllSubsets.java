package Algorithms.Bitwisealgo;

import java.util.ArrayList;

public class AllSubsets {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3}; // Initialize the array with the values 1, 2, and 3
        int len = nums.length; // Get the length of the array
        int subsets = 1 << len; // Calculate the total number of subsets (2^len)
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // Initialize the list to store all subsets

        // Loop over all possible subsets
        for (int i = 0; i < subsets; i++) {
            ArrayList<Integer> curr = new ArrayList<>(); // Initialize the current subset
            // Loop over each element in the array to check if it should be included in the current subset
            for (int j = 0; j < len; j++) {
                // Use bitwise AND to check if the j-th bit in i is set
                if ((i & (1 << j)) != 0) {
                    curr.add(nums[j]); // If the j-th bit is set, add the corresponding element to the current subset
                }
            }
            ans.add(curr); // Add the current subset to the list of all subsets
        }
        System.out.println(ans); // Print all subsets
    }
}
