// Stack implementation in Java

class Stack1 {
    private int arr[];
    private int top;
    private int capacity;

    // Creating a stack
    Stack1(int size) {
        arr = new int[size]; // Initialize the array to store stack elements
        capacity = size; // Set the capacity of the stack
        top = -1; // Initialize top to -1 as the stack is empty
    }

    // Add elements into the stack (Push operation)
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow - Stack is full. Program Terminated.");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x; // Increment top and insert the element into the stack
    }

    // Remove element from the stack (Pop operation)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow - Stack is empty. Program Terminated.");
            System.exit(1);
        }
        return arr[top--]; // Return the top element and decrement top
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1; // The size is the current value of top plus 1
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1; // Stack is empty if top is -1
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1; // Stack is full if top is equal to capacity minus 1
    }

    // Print the elements in the stack
    public void printStack() {
        System.out.println("Elements in the stack:");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]); // Print each element in the stack
        }
    }

    // Main method for testing the stack
    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();
    }
}
