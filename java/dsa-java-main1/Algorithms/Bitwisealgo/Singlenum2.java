package Algorithms.Bitwisealgo;

public class Singlenum2 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 3, 4, 1, 2, 1, 2, 1, 2};
        int ans = 0;

        // Iterate over each bit position
        for (int i = 0; i < 32; i++) {
            int curr = 0;
            
            // Count the number of 1s at the i-th bit position in all numbers
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    curr++;
                }
            }

            // If the count of 1s at this bit position is not a multiple of 3,
            // it means the single number has a 1 at this bit position.
            if (curr % 3 != 0) {
                ans = ans | (1 << i);
            }
        }

        // Print the single number
        System.out.println(ans);
    }
}
