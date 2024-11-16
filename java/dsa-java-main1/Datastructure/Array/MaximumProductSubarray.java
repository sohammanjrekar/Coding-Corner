// package Array;

// public class MaximumProductSubarray {
//     public static void main(String[] args) {
//         int[] arr={2,3,-2,4};
//         int max=0;
//         for (int i = 0; i < arr.length; i++) {
//             int product=1;
//             for (int j = i; j < arr.length; j++) {
               
//              product*=arr[j];
                
//                 max=Math.max(max, product);
//             }
//         }

//         System.out.println("Product :"+max);
//     }
// }
package Array;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int result = maxProduct(arr);
        System.out.println("Maximum Product Subarray: " + result);
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            
            if (current < 0) {
                // Swap maxProduct and minProduct
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
