package Array;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        List<Integer> result = spiralOrder(arr);
        System.out.println(result);
    }

    // Function to return the spiral order traversal of a matrix
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        // Handle edge case of empty matrix
        if (matrix == null || matrix.length == 0) {
            return ans;
        }
        
        // Initialize boundaries
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        // Traverse the matrix in spiral order
        while (left <= right && top <= bottom) {
            // Traverse from left to right on the top boundary
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            
            // Traverse from top to bottom on the right boundary
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            
            // Traverse from right to left on the bottom boundary if there are rows left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // Traverse from bottom to top on the left boundary if there are columns left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
