package String;

public class stream {
    public static void main(String[] args) {
        System.out.println(skipapple("bcappleal"));
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (up.startsWith("a")) {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipapple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipapple(up.substring(5));
        } else {
            return up.charAt(0)+skipapple(up.substring(1));
        }
    }
}
