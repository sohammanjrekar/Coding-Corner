package Array;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2, 4, 5, 1};

        // Method 1: Using HashSet to remove duplicates
        Set<Integer> uniqueElements = removeDuplicatesWithHashSet(nums);
        System.out.println("Unique elements (HashSet): " + uniqueElements);

        // Method 2: Using ArrayList and contains method to remove duplicates
        List<Integer> uniqueElementsList = removeDuplicatesWithArrayList(nums);
        System.out.println("Unique elements (ArrayList): " + uniqueElementsList);
    }

    // Method 1: Using HashSet to remove duplicates
    // Time Complexity: O(n), where n is the number of elements in the array
    // Space Complexity: O(n) in the worst case
    public static Set<Integer> removeDuplicatesWithHashSet(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        return uniqueElements;
    }

    // Method 2: Using ArrayList and contains method to remove duplicates
    // Time Complexity: O(n^2), where n is the number of elements in the array
    // Space Complexity: O(n) in the worst case
    public static List<Integer> removeDuplicatesWithArrayList(int[] nums) {
        List<Integer> uniqueElements = new ArrayList<>();
        for (int num : nums) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
            }
        }
        return uniqueElements;
    }
}
