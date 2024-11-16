package Algorithms.Recursion;

public class keyboard_combination {
    public static void main(String[] args) {
        String input = "23";
        findcombinations(input, 0, "");
    }

    static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    private static void findcombinations(String input, int i, String ans) {
        if (i == input.length()) {
            System.out.println(ans);
            return;
        }
        char currchar = input.charAt(i);
        int no = currchar - '0';
        String ex = keypad[no];
        for (int j = 0; j < ex.length(); j++) {
            findcombinations(input, i + 1, ans + ex.charAt(j));
        }
    }
}

// 0->.
// 1->abc
// 2->def
// 3->ghi
// 4->jkl
// 5->mno
// 6->pqrs
// 7->tu
// 8->vwx
// 9->yz