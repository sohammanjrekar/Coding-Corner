package String;

import java.util.Arrays;

public class sort_string {
    public static void main(String[] args) {
        String str = "ssohamb";
        char[] ans = str.toCharArray();
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        str = String.valueOf(ans);
        System.out.println(str);
    }
}
