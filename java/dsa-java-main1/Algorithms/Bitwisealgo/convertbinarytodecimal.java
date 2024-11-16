package Algorithms.Bitwisealgo;

public class convertbinarytodecimal {
    public static void main(String[] args) {
        // Testing the convert method with the binary string "1101"
        System.out.println(convert("1101"));  
    }

    public static int convert(String str) {
        int ans = 0;
        int len = str.length();

        // Loop to convert binary string to decimal number
        for (int i = 0; i < len; i++) {
            // Extract the character at position i from the right end
            char c = str.charAt(len - 1 - i);
            // Convert character to integer (0 or 1) and add to ans
            ans += (c - '0') * Math.pow(2, i);
        }

        return ans;
    }
}
