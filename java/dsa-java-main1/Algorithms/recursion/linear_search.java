package Algorithms.Recursion;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int[] sort = { 1, 2, 3, 8, 5 };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(linearsearch(sort, 0, target));
        sc.close();
    }

    static int linearsearch(int[] arr, int i, int target) {
        if (arr[i] == target) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }

        return linearsearch(arr, i + 1, target);
    }
}