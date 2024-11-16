package Algorithms.Recursion;

public class replace_duplicate_aphabet {
    public static void main(String[] args) {
        String str = "sohaamms";
        System.out.println(replaceduplicate(str, 0));
    }

    static String ans = "";
    static boolean[] map = new boolean[26];

    private static String replaceduplicate(String str, int i) {
        if (i == str.length() - 1) {
            return ans;
        }
        char c = str.charAt(i);
        if (map[c - 'a']) {
            replaceduplicate(str, i + 1);
        } else {
            ans += c;
            map[c - 'a'] = true;
            replaceduplicate(str, i + 1);
        }
        return ans;
    }
}
