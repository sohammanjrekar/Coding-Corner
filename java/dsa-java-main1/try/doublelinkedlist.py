# Define a Node for our Doubly Linked List
class Node:
    # Creating a node
    def __init__(self, item):
        self.item = item          # Each node stores an item
        self.next = None           # Each node has a reference to the next node
        self.previous = None   # Each node has a reference to the previous node


# Define the Doubly Linked List
class LinkedList:

    def __init__(self):
        self.head = None   # The doubly linked list starts with no nodes initially


# Main part of the program
if __name__ == '__main__':
    # Create a doubly linked list
    linked_list = LinkedList()

    # Assign item values to nodes
    linked_list.head = Node(1)
    second = Node(2)
    third = Node(3)
    forth = Node(10)

    # Connect nodes in the doubly linked list
    linked_list.head.next = second
    second.next = third
    third.next = forth
    tail=forth

    forth.previous = third
    third.previous = second
    second.previous = linked_list.head
    # Print the doubly linked list items
    while linked_list.head is not None:
        print(linked_list.head.item, end=" ")  # Print the current item
        linked_list.head = linked_list.head.next  # Move to the next node
    print("")
    while tail is not None:
        print(tail.item, end=" ")  # Print the current item
        tail = tail.previous # Move to the next node

# Output: 1 2 3 10
