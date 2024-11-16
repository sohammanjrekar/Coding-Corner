class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        """Check if the stack is empty."""
        return len(self.items) == 0

    def push(self, item):
        """Add an item to the top of the stack."""
        self.items.append(item)

    def pop(self):
        """Remove and return the item at the top of the stack."""
        if not self.is_empty():
            return self.items.pop()
        else:
            print("Stack is empty. Cannot pop.")
            return None

    def peek(self):
        """Return the item at the top of the stack without removing it."""
        if not self.is_empty():
            return self.items[-1]
        else:
            print("Stack is empty. Cannot peek.")
            return None

    def size(self):
        """Return the number of items in the stack."""
        return len(self.items)

# Example usage:
stack = Stack()
print("Is stack empty?", stack.is_empty())  # Output: True
stack.push(1)
stack.push(2)
stack.push(3)
print("Stack size:", stack.size())  # Output: 3
print("Peek top of stack:", stack.peek())  # Output: 3
print("Pop top of stack:", stack.pop())  # Output: 3
print("Stack size after pop:", stack.size())  # Output: 2
