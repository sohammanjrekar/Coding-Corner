package Stack1;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        reverse(s);
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

    private static void reverse(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushatbottom1(s, top);
    }
}
