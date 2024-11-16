package Algorithms.DynamicProgramming;

import java.util.Arrays;

import String.sort_string;

public class knapsack01_2D {
    // A Dynamic Programming based solution
    // for 0-1 Knapsack problem

    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Returns the maximum value that can
    // be put in a knapsack of capacity W
    static int knapSack(int maxWeight, int weightlist[], int pricelist[], int NumberOfObjects) {
        int i, w;
        int Table[][] = new int[NumberOfObjects + 1][maxWeight + 1];
    
        // Build table Table[][] in bottom up manner
        for (i = 0; i <= NumberOfObjects; i++) {
            for (w = 0; w <= maxWeight; w++) {
                if (i == 0 || w == 0)
                    Table[i][w] = 0;
                else if (weightlist[i - 1] <= w)
                    Table[i][w] = max(pricelist[i - 1] + Table[i - 1][w - weightlist[i - 1]], Table[i - 1][w]);
                else
                    Table[i][w] = Table[i - 1][w];
            }
        }
        for (int j = 0; j < NumberOfObjects + 1; j++) {
            System.out.println(Arrays.toString(Table[j]));
        }
        System.out.println();
        return Table[NumberOfObjects][maxWeight];
    }

    // Driver code
    public static void main(String args[]) {
        int profit[] = new int[] { 10, 15, 40 };
        int weight[] = new int[] { 1, 2, 3 };
        int W = 6;
        int NumberOfObjects = profit.length;

        System.out.println("Max Profit: " + knapSack(W, weight, profit, NumberOfObjects));
    }
}
// Time Complexity: O(N * W). where ‘N’ is the number of elements and ‘W’ is
// capacity.
// Auxiliary Space: O(N * W). The use of a 2-D array of size ‘N*W’.