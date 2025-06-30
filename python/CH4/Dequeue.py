# Dequeue is a double-ended queue that allows insertion and deletion of elements from both ends.
class Dequeue:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def add_front(self, item):
        self.items.insert(0, item)

    def add_rear(self, item):
        self.items.append(item)

    def remove_front(self):
        if not self.is_empty():
            return self.items.pop(0)
        raise IndexError("Dequeue is empty")

    def remove_rear(self):
        if not self.is_empty():
            return self.items.pop()
        raise IndexError("Dequeue is empty")

    def size(self):
        return len(self.items)

    def peek_front(self):
        if not self.is_empty():
            return self.items[0]
        raise IndexError("Dequeue is empty")

    def peek_rear(self):
        if not self.is_empty():
            return self.items[-1]
        raise IndexError("Dequeue is empty")

    def __str__(self):
        return str(self.items)
    
# Example usage
if __name__ == "__main__":
    dq = Dequeue()
    dq.add_rear(1)
    dq.add_rear(2)
    dq.add_front(0)
    print("Deque after additions:", dq)
    print("Front element:", dq.peek_front())
    print("Rear element:", dq.peek_rear())
    dq.remove_front()
    print("Deque after removing front element:", dq)
    dq.remove_rear()
    print("Deque after removing rear element:", dq)