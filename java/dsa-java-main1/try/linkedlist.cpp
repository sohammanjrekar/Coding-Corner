// Linked list implementation in C++

#include <bits/stdc++.h>
#include <iostream>
using namespace std;

// Creating a node
class Node {
public:
    int value;
    Node* next;
};

int main() {
    Node* head;       // Head pointer for the linked list
    Node* one = NULL; // Individual nodes
    Node* two = NULL;
    Node* three = NULL;

    // Allocate memory for 3 nodes on the heap
    one = new Node();
    two = new Node();
    three = new Node();

    // Assign values to the nodes
    one->value = 1;
    two->value = 2;
    three->value = 3;

    // Connect nodes to form a linked list
    one->next = two;
    two->next = three;
    three->next = NULL;

    // Print the linked list values
    head = one;
    while (head != NULL) {
        cout << head->value;   // Print the current node's value
        head = head->next;      // Move to the next node
    }
}
