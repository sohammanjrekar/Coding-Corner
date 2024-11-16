package Array;

import java.util.*;

public class Q3Sum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = new ArrayList<>();

        // Method 1: Brute Force approach O(n^3)
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp); // Sort the triplet to ensure uniqueness
                        ans.add(temp);
                    }
                }
            }
        }

        // Method 2: HashMap approach O(n^2)
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            hm.clear(); // Clear the hashmap for each i
            for (int j = i + 1; j < arr.length; j++) {
                int complement = -(arr[i] + arr[j]);
                if (hm.containsKey(complement)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], complement);
                    Collections.sort(temp); // Sort the triplet to ensure uniqueness
                    ans.add(temp);
                }
                hm.put(arr[j], j);
            }
        }

        // Method 3: Sorted Array with Two-Pointer approach O(n^2)
        Arrays.sort(arr); // Sort the array to easily skip duplicates
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicates for i

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[left], arr[right]);
                    ans.add(temp);
                    while (left < right && arr[left] == arr[left + 1]) left++; // Skip duplicates for left
                    while (left < right && arr[right] == arr[right - 1]) right--; // Skip duplicates for right
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // Remove duplicates from ans
        Set<List<Integer>> uniqueTriplets = new HashSet<>(ans);
        ans.clear();
        ans.addAll(uniqueTriplets);

        System.out.println(ans.size()); // Print the count of unique triplets
        System.out.println(ans); // Print the list of unique triplets
    }
}
