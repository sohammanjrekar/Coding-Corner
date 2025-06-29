# linkedlist is a data structure that consists of a sequence of elements, where each element points to the next one.
# It allows for efficient insertion and deletion of elements, as well as dynamic memory allocation.
class Node:
    # constructor for the Node class
    # It initializes the data and next attributes of the node.
    def __init__(self, data):
        self.data = data
        self.next = None
class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def print_list(self):
        current = self.head
        print('Head -> ', end='')
        while current:
            print(f'{current.data} -> ', end='')
            current = current.next
        print('Tail')

    def insert_at_beginning(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_after(self, prev_node_data, data):
        current = self.head
        while current:
            if current.data == prev_node_data:
                new_node = Node(data)
                new_node.next = current.next
                current.next = new_node
                return
            current = current.next
        print("Previous node not found in the list.")
        
    def delete_node(self, key):
        current = self.head
        prev = None
        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next
                else:
                    self.head = current.next
                return
            prev = current
            current = current.next
        print("Node with data", key, "not found.")
    def search(self, key):
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
    def reverse(self):
        prev = None
        current = self.head
        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node
        self.head = prev
    def length(self):
        count = 0
        current = self.head
        while current:
            count += 1
            current = current.next
        return count
list1 = LinkedList()
list1.append(1)
list1.append(2)
list1.append(3) 
list1.append(4)
list1.print_list()
print("Length of the list:", list1.length())
list1.insert_at_beginning(0)
list1.print_list()

# Build-in linked list
import collections
my_linked_list = collections.deque([1, 2, 3, 4])
print("Built-in linked list:", my_linked_list)
# Adding elements to the built-in linked list
my_linked_list.append(5)
print("After adding an element:", my_linked_list)
# Removing elements from the built-in linked list
my_linked_list.popleft()  # Removes the first element
print("After removing an element:", my_linked_list)
# Searching for an element in the built-in linked list
print("Is 3 in the linked list?", 3 in my_linked_list)
# Reversing the built-in linked list
my_linked_list.reverse()
print("After reversing the linked list:", my_linked_list)
# Reversing the custom linked list
list1.reverse()
list1.print_list()
# Searching for an element in the custom linked list
print("Is 3 in the linked list?", list1.search(3) is not None)
# Deleting a node from the custom linked list
list1.delete_node(2)
list1.print_list()
# Inserting a node after a specific node in the custom linked list
list1.insert_after(3, 2.5)
list1.print_list()