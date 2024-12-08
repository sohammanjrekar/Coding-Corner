#include <iostream>
#include <vector>
#include <deque>
#include <list>
#include <forward_list>
#include <array>
#include <queue> // For queue
using namespace std;
int main() {
    // 1. Vector
    vector<int> vec = {1, 2, 3, 4, 5};
    vec.push_back(6); // Add an element at the end
    cout << "Vector: ";
    for (int v : vec) {
        cout << v << " ";
    }
    cout << endl;

    // 2. Deque
    deque<int> deq = {10, 20, 30};
    deq.push_front(5);
    deq.push_back(40);
    cout << "Deque: ";
    for (int d : deq) {
        cout << d << " ";
    }
    cout << endl;

    // 3. List
    list<int> lst = {100, 200, 300};
    lst.push_front(50);
    lst.push_back(400);
    cout << "List: ";
    for (int l : lst) {
        cout << l << " ";
    }
    cout << endl;

    // 4. Forward List
    forward_list<int> flst = {500, 600, 700};
    flst.push_front(400);
    cout << "Forward List: ";
    for (int f : flst) {
        cout << f << " ";
    }
    cout << endl;

    // 5. Array (Fixed size)
    array<int, 5> arr = {9, 8, 7, 6, 5};
    cout << "Array: ";
    for (int a : arr) {
        cout << a << " ";
    }
    cout << endl;

    // 6. Queue
    queue<int> que;
    que.push(1);
    que.push(2);
    que.push(3);
    cout << "Queue: ";
    while (!que.empty()) {
        cout << que.front() << " ";
        que.pop(); // Remove the front element
    }
    cout << endl;

    return 0;
}
