# Stack implementation in Python

# Creating a stack
def create_stack():
    stack = []  # A stack is represented as a list
    return stack

# Checking if the stack is empty
def check_empty(stack):
    return len(stack) == 0

# Adding items into the stack (push operation)
def push(stack, item):
    stack.append(item)  # Append the item to the end of the list (top of the stack)
    print("pushed item: " + item)

# Removing an element from the stack (pop operation)
def pop(stack):
    if check_empty(stack):
        return "stack is empty"

    return stack.pop()  # Remove and return the last item in the list (top of the stack)

# Create an empty stack
stack = create_stack()

# Push items onto the stack
push(stack, str(1))
push(stack, str(2))
push(stack, str(3))
push(stack, str(4))
print(" ")
# Pop an item from the stack
print("popped item: " + pop(stack))

# Print the stack after popping an element
print("stack after popping an element: " + str(stack))
