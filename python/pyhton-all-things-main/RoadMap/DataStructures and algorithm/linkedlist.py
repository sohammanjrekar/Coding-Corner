class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def is_empty(self):
        """Check if the linked list is empty."""
        return self.head is None

    def append(self, data):
        """Add a new node to the end of the linked list."""
        new_node = Node(data)
        if not self.head:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def prepend(self, data):
        """Add a new node to the beginning of the linked list."""
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_after(self, prev_node, data):
        """Insert a new node after a given node."""
        if not prev_node:
            print("Previous node is not in the list")
            return
        new_node = Node(data)
        new_node.next = prev_node.next
        prev_node.next = new_node

    def delete_node(self, key):
        """Delete a node with a given key."""
        current = self.head
        if current and current.data == key:
            self.head = current.next
            current = None
            return
        prev = None
        while current and current.data != key:
            prev = current
            current = current.next
        if current is None:
            return
        prev.next = current.next
        current = None

    def print_list(self):
        """Print all elements in the linked list."""
        current = self.head
        while current:
            print(current.data, end=" ")
            current = current.next
        print()

# Example usage:
llist = LinkedList()
print("Is linked list empty?", llist.is_empty())  # Output: True
llist.append(1)
llist.append(2)
llist.append(3)
llist.prepend(0)
llist.insert_after(llist.head.next, 1.5)
llist.print_list()  # Output: 0 1 1.5 2 3
llist.delete_node(1)
llist.print_list()  # Output: 0 1.5 2 3
