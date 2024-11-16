from collections import deque

class Queue:
    def __init__(self):
        self.items = deque()

    def is_empty(self):
        """Check if the queue is empty."""
        return len(self.items) == 0

    def enqueue(self, item):
        """Add an item to the rear of the queue."""
        self.items.append(item)

    def dequeue(self):
        """Remove and return the item at the front of the queue."""
        if not self.is_empty():
            return self.items.popleft()
        else:
            print("Queue is empty. Cannot dequeue.")
            return None

    def peek(self):
        """Return the item at the front of the queue without removing it."""
        if not self.is_empty():
            return self.items[0]
        else:
            print("Queue is empty. Cannot peek.")
            return None

    def size(self):
        """Return the number of items in the queue."""
        return len(self.items)

# Example usage:
queue = Queue()
print("Is queue empty?", queue.is_empty())  # Output: True
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
print("Queue size:", queue.size())  # Output: 3
print("Peek front of queue:", queue.peek())  # Output: 1
print("Dequeue front of queue:", queue.dequeue())  # Output: 1
print("Queue size after dequeue:", queue.size())  # Output: 2
