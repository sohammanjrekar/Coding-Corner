package Algorithms.Recursion;

public class moveallxlast {
    public static void main(String[] args) {
        String str = "soxhxaxxm";
        System.out.println(movex(str, 0));
    }

    static String ans = "";
    static int count1 = 0;

    private static String movex(String str, int i) {
        if (i == str.length() - 1) {
            while (count1 > 0) {
                ans = ans.concat("x");
                count1--;
            }
            return ans;
        }
        if (str.charAt(i) == 'x') {
            ans = str.replace("x", "");
            count1++;
        }
        movex(str, i + 1);
        return ans;
    }
}
