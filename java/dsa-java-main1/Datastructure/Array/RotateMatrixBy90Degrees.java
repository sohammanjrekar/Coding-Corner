package Array;


public class RotateMatrixBy90Degrees {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int n = arr.length;
 // int[][] ans = new int[n][arr[0].length];

        // // Rotating the matrix by 90 degrees clockwise
        // for (int row = 0; row < n; row++) {
        //     for (int col = 0; col < arr[0].length; col++) {
        //         ans[col][n - 1 - row] = arr[row][col];
        //     }
        // }
        rotate(arr);

        // Printing the rotated matrix
        System.out.println("Matrix after rotating by 90 degrees clockwise:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] arr) {
        int n = arr.length;

        // Transpose the matrix
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) { // Start from 'row' to avoid re-swapping
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }

        // Reverse each row
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n / 2; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[row][n - 1 - col];
                arr[row][n - 1 - col] = temp;
            }
        }
    }
}
