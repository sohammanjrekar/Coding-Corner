package Algorithms.Recursion;

public class subsequence {
    public static void main(String[] args) {
        String str = "abc";
        find_subsequence(str, 0, "");
    }

    private static void find_subsequence(String str, int i, String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        char chr = str.charAt(i);
        find_subsequence(str, i + 1, ans + chr);
        find_subsequence(str, i + 1, ans);
    }
}
