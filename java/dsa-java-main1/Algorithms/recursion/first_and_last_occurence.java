package Algorithms.Recursion;

public class first_and_last_occurence {
    static int first = 0;
    static int last = 0;

    static void occur(String str, char c, int n) {
        if (n == str.length()) {
            return;
        }
        if (c == str.charAt(n) && first == 0) {
            first = n;
        } else if (c == str.charAt(n)) {
            last = n;
        }
        occur(str, c, n + 1);

    }

    public static void main(String[] args) {
        String mi = "sohammanjrekar";
        occur(mi, 'm', 1);
        System.out.println(first + "  " + last);
    }
}
