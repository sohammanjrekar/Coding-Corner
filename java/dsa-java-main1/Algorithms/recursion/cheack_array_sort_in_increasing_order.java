package Algorithms.Recursion;

public class cheack_array_sort_in_increasing_order {
    static boolean sorting(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return sorting(arr, i + 1);

        } else {

            return false;
        }

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 8, 6 };
        System.out.println(sorting(array, 0));
    }
}
