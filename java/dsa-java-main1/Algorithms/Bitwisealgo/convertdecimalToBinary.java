package Algorithms.Bitwisealgo;

public class convertdecimalToBinary {
    public static void main(String[] args) {
        // Testing the convert2binary method with the value 13
        System.out.println(convert2binary(13));  
    }

    public static String convert2binary(int n) {
        // StringBuilder for efficient string manipulation
        StringBuilder ans = new StringBuilder();
        
        // Handle the edge case where n is 0
        if (n == 0) {
            return "0";
        }
        
        // Loop to convert the number to binary
        while (n > 0) {
            if (n % 2 == 1) {
                ans.append('1');
            } else {
                ans.append('0');
            }
            n = n / 2;
        }
        
        // Reverse the string to get the correct binary representation
        ans.reverse();
        
        return ans.toString();
    }
}
