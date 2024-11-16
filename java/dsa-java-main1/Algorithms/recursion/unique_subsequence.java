package Algorithms.Recursion;

import java.util.HashSet;

public class unique_subsequence {
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<String>();
        find_subsequence(str, 0, "", set);
        System.out.println(set);
    }

    private static void find_subsequence(String str, int i, String ans, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(ans)) {
                return;
            } else {
                set.add(ans);
                System.out.println(ans);
                return;
            }
        }
        char chr = str.charAt(i);

        find_subsequence(str, i + 1, ans + chr, set);
        find_subsequence(str, i + 1, ans, set);
    }
}
