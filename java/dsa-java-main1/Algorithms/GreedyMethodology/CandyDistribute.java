package GreedyMethodology;

public class CandyDistribute {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1};
        int n = arr.length;
        
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        // Initialize candies array with 1 candy for each child
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }
        
        // Traverse from left to right
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        
        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        
        // Sum up the candies
        int count = 0;
        for (int candy : candies) {
            count += candy;
        }
        
        System.out.println(count);
    }
}
