package Stack1;

import java.util.Stack;

public class pushatbottom {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(80);
        s.push(45);
        int n = 100;
        pushatbottom1(s, n);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    private static void pushatbottom1(Stack<Integer> s, int i) {
        if (s.empty()) {
            s.push(i);
            return;
        }
        int top = s.pop();
        pushatbottom1(s, i);
        s.push(top);

    }
}
