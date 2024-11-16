package String;

public class reverse_string {
    public static void main(String[] args) {
        String str = "soham";
        char[] string = str.toCharArray();
        int n = string.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = string[i];
            string[i] = string[n - i - 1];
            string[n - i - 1] = temp;
        }
        String ans = String.valueOf(string);
        System.out.println(ans);
    }
}
