package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // Brute Force Method
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int bruteForce(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1; // Return -1 if no majority element is found
    }

    // HashMap Method
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int usingHashMap(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = arr.length;

        // Count the frequency of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1; // Return -1 if no majority element is found
    }

    // Moore's Voting Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)
   // Moore's Voting Algorithm method to find the majority element
   public static int mooresVoting(int[] arr) {
    // Find the candidate for the majority element
    int candidate = findCandidate(arr);
    // Verify if the candidate is indeed the majority element
    return isMajority(arr, candidate) ? candidate : -1;
}

// Helper method to find the candidate for the majority element
private static int findCandidate(int[] arr) {
    int count = 0;         // Variable to keep track of the count
    int candidate = -1;    // Variable to store the candidate for majority element

    // Traverse through the array to find the candidate
    for (int num : arr) {
        if (count == 0) {
            // If count is zero, select the current element as the candidate
            candidate = num;
        }
        // Increment count if the current element is the candidate, otherwise decrement it
        count += (num == candidate) ? 1 : -1;
    }

    // Return the candidate found
    return candidate;
}

// Helper method to check if the candidate is indeed the majority element
private static boolean isMajority(int[] arr, int candidate) {
    int count = 0;  // Variable to count the occurrences of the candidate

    // Traverse through the array to count occurrences of the candidate
    for (int num : arr) {
        if (num == candidate) {
            count++;
        }
    }

    // Return true if the candidate occurs more than n/2 times, otherwise false
    return count > arr.length / 2;
}


    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 3, 1, 2, 2};

        // Method 1: Brute Force
        int majorityBruteForce = bruteForce(arr);
        System.out.println("Majority Element (Brute Force): " + majorityBruteForce);

        // Method 2: Using HashMap
        int majorityHashMap = usingHashMap(arr);
        System.out.println("Majority Element (HashMap): " + majorityHashMap);

        // Method 3: Moore's Voting Algorithm
        int majorityMoores = mooresVoting(arr);
        System.out.println("Majority Element (Moore's Voting): " + majorityMoores);
    }
}

/*
Time Complexity and Space Complexity:

Method 1: Brute Force
- Time Complexity: O(n^2)
  This is because we use two nested loops to count the frequency of each element.
- Space Complexity: O(1)
  This is because we use only a constant amount of extra space.

Method 2: Using HashMap
- Time Complexity: O(n)
  This is because we traverse the array once and perform constant-time operations for each element.
- Space Complexity: O(n)
  This is because we may store the frequency of each element in the hash map.

Method 3: Moore's Voting Algorithm
- Time Complexity: O(n)
  This is because we traverse the array twice: once to find the candidate and once to confirm it.
- Space Complexity: O(1)
  This is because we use only a constant amount of extra space.
*//*
Moore's Voting Algorithm Explanation:

1. findCandidate Method:
   - Initialize `count` to 0 and `candidate` to -1.
   - Traverse the array:
     - If `count` is 0, set `candidate` to the current element.
     - Increment `count` if the current element is equal to `candidate`, otherwise decrement `count`.
   - The idea is to cancel out each occurrence of an element which is not the majority element with an occurrence of the majority element. In the end, `candidate` will be left as the majority element.

2. isMajority Method:
   - Initialize `count` to 0.
   - Traverse the array:
     - Increment `count` for each occurrence of `candidate`.
   - Return true if `count` is greater than half the size of the array, indicating that the candidate is indeed the majority element.

Time Complexity:
- The time complexity of this solution is O(n), where n is the length of the array. This is because we traverse the array twice: once to find the candidate and once to confirm it.

Space Complexity:
- The space complexity is O(1) because we use only a constant amount of extra space for variables.
*/

