package GreedyMethodology;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] greed = {1, 5, 3, 3, 4}; // Array representing the greediness of each child.
        int[] cookies = {4, 2, 1, 2, 1, 3}; // Array representing the sizes of available cookies.

        Arrays.sort(greed); // Sort the greed array in ascending order.
        Arrays.sort(cookies); // Sort the cookies array in ascending order.

        int g = greed.length; // Number of children.
        int c = cookies.length; // Number of cookies.

        int gs = 0, cs = 0; // gs: index for greed array, cs: index for cookies array.

        // Loop until we have checked all children or all cookies.
        while (gs < g && cs < c) {
            if (greed[gs] <= cookies[cs]) { // If the current cookie can satisfy the current child's greed.
                System.out.println("Greed is " + greed[gs] + " and cookie is " + cookies[cs]);
                gs++; // Move to the next child.
            }
            cs++; // Move to the next cookie regardless of whether it was used.
        }

        // Output the number of satisfied children.
        System.out.println("Number of satisfied children: " + gs);
    }
}

/*
Time Complexity: O(n log n + m log m)
- Sorting the greed array takes O(n log n) time.
- Sorting the cookies array takes O(m log m) time.
- The while loop runs in O(n + m) time.

Space Complexity: O(1)
- The algorithm uses a constant amount of extra space beyond the input arrays.
*/
