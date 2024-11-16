package GreedyMethodology;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int result = jump(arr);
        System.out.println("Minimum jumps needed: " + result);
    }

    public static int jump(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int jumps = 0;      // Number of jumps needed to reach the end
        int currentEnd = 0; // The farthest we can reach with the current number of jumps
        int farthest = 0;   // The farthest we can reach with the next jump

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            // If we have come to the end of the range that we can reach with the current number of jumps
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // If we can already reach the end of the array, break
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}

/*
Time Complexity: O(n)
- We iterate through the array once.

Space Complexity: O(1)
- We use a constant amount of extra space.
*/
