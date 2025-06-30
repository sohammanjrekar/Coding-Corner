# Double Linked List
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class DoublyLinkedList:
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
        new_node.prev = last

    def display(self):
        current = self.head
        while current:
            print(current.data, end=" ")
            current = current.next
        print()

    def display_reverse(self):
        current = self.head
        while current and current.next:
            current = current.next
        while current:
            print(current.data, end=" ")
            current = current.prev
        print()
    def insert_after(self, prev_node_data, data):
        current = self.head
        while current:
            if current.data == prev_node_data:
                new_node = Node(data)
                new_node.next = current.next
                new_node.prev = current
                if current.next:
                    current.next.prev = new_node
                current.next = new_node
                return
            current = current.next
        print("Node with data", prev_node_data, "not found.")       
    def delete_node(self, data):
        current = self.head
        while current:
            if current.data == data:
                if current.prev:
                    current.prev.next = current.next
                if current.next:
                    current.next.prev = current.prev
                if current == self.head:
                    self.head = current.next
                del current
                return  
        print("Node with data", data, "not found.")
    def search(self, data):
        current = self.head
        while current:
            if current.data == data:
                return True
            current = current.next
        return False    
# Example usage
if __name__ == "__main__":
    dll = DoublyLinkedList()
    dll.append(1)
    dll.append(2)
    dll.append(3)
    
    print("Doubly Linked List:")
    dll.display()  # Output: 1 2 3
    
    print("Reverse Display:")
    dll.display_reverse()  # Output: 3 2 1
    
    dll.insert_after(2, 2.5)
    print("After inserting 2.5 after 2:")
    dll.display()  # Output: 1 2 2.5 3
    
    dll.delete_node(2.5)
    print("After deleting node with data 2.5:")
    dll.display()  # Output: 1 2 3
    
    print("Search for node with data 3:", dll.search(3))  # Output: True
    print("Search for node with data 4:", dll.search(4))  # Output: False       