package Algorithms.Bitwisealgo;
public class singlenumUsingtwosones {
  
        public static void main(String[] args) {
            int[] nums = new int[]{3, 3, 3, 4, 1, 2, 1, 2, 1, 2};
            System.out.println(singleNumber(nums)); // Output should be 4
        }
    
        public static int singleNumber(int[] nums) {
            int ones = 0; // to store bits appearing once
            int twos = 0; // to store bits appearing twice
    
            for (int num : nums) {
                // When `num` comes in for the first time, it will be recorded in `ones`
                // If `num` comes in again, it will be moved to `twos`
                // If `num` comes in the third time, it will be removed from both `ones` and `twos`
                ones = (ones ^ num) & ~twos;
                twos = (twos ^ num) & ~ones;
            }
    
            // Only the unique number remains in `ones`
            return ones;
        }
    }
    