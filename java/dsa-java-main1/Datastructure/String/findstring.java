package String;

import java.util.Scanner;

public class findstring {
    public static void main(String[] args) {
        String str = "aubbcubcusebcicheogcwwsuah";
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        int ans = str.indexOf(target);
        System.out.println(ans);
    }
}
