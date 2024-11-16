package Algorithms.Recursion;

public class permutaions_of_string {
    public static void main(String[] args) {
        String str = "abc";
        permutaions(str, "");
    }

    private static void permutaions(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permutaions(newstr, permutation + ch);

        }
    }
}
