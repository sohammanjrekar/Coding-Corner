package Algorithms.GreedyMethodology;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "(**){}[*]";
        
        if (isValid(str)) {
            System.out.println("The string has valid parentheses.");
        } else {
            System.out.println("The string has invalid parentheses.");
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            // Push only opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched pair
                }
            }
            // Ignore all other characters including '*'
        }
        return stack.isEmpty(); // Check if all opening brackets have been matched
    }
}
