package Algorithms.Recursion;

public class array_is_sort_or_not {
    public static void main(String[] args) {
        int[] sort = { 1, 2, 3, 8, 5 };
        System.out.println(sortrev(sort, 0));
    }

    static boolean sortrev(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return sortrev(arr, i + 1);
    }
}
