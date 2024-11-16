package GreedyMethodology;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 4}; // Array representing the maximum jump lengths at each position.
        int max = 0; // Variable to keep track of the maximum index we can reach.

        for (int i = 0; i < arr.length; i++) {
            if (i > max) { // If the current index is greater than the maximum reachable index.
                System.out.println(false); // We cannot proceed further.
                return; // Exit the function.
            }
            max = Math.max(max, i + arr[i]); // Update the maximum reachable index.
        }
        System.out.println(true); // If we exit the loop normally, the end of the array is reachable.
    }
}

/*
Time Complexity: O(n)
- The algorithm iterates through the array once.

Space Complexity: O(1)
- The algorithm uses a constant amount of extra space.
*/
