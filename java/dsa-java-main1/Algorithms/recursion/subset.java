package Algorithms.Recursion;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> set = new ArrayList<>();
        subsetfind(n, set);

    }

    private static void subsetfind(int n, ArrayList<Integer> set) {
        if (n == 0) {
            printset(set);
            return;
        }
        set.add(n);
        subsetfind(n - 1, set);
        set.remove(set.size() - 1);
        subsetfind(n - 1, set);
    }

    private static void printset(ArrayList<Integer> set) {
        for (int index = 0; index < set.size(); index++) {
            System.out.print(set.get(index) + " ");
        }
        System.out.println();
    }
}
