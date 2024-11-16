package Stack1;

import java.util.Stack;

// A stack class is provided by the Java collection framework and it implements the Stack data structure. The stack implements LIFO i.e. Last In First Out. This means that the elements pushed last are the ones that are popped first.

// 1	boolean empty():Tests if this stack is empty. Returns true if the stack is empty, and returns false if the stack contains elements.
// 2	Object peek( ): Returns the element on the top of the stack, but does not remove it.
// 3	Object pop( ): Returns the element on the top of the stack, removing it in the process.
// 4	Object push(Object element): Pushes the element onto the stack. Element is also returned.
// 5	int search(Object element):Searches for element in the stack. If found, its offset from the top of the stack is returned. Otherwise, -1 is returned.

class stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(70);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push(700);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        stack.push(80);
        stack.push(90);
        System.out.println(stack);
        System.out.println(stack.search(10));
        ;
    }
}