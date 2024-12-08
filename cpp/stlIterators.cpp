#include <iostream>
#include <vector>
#include <iterator> // For ostream_iterator
using namespace std;
int main() {
    vector<int> vec = {1, 2, 3, 4, 5};

    // Normal Iterator
    cout << "Normal Iterator: ";
    for (vector<int>::iterator it = vec.begin(); it != vec.end(); ++it) {
        cout << *it << " ";
    }
    cout << endl;

    // Const Iterator
    cout << "Const Iterator: ";
    for (vector<int>::const_iterator it = vec.cbegin(); it != vec.cend(); ++it) {
        cout << *it << " ";
    }
    cout << endl;

    // Reverse Iterator
    cout << "Reverse Iterator: ";
    for (vector<int>::reverse_iterator it = vec.rbegin(); it != vec.rend(); ++it) {
        cout << *it << " ";
    }
    cout << endl;

    // Output Iterator
    cout << "Output Iterator: ";
    ostream_iterator<int> out(cout, " ");
    copy(vec.begin(), vec.end(), out);
    cout << endl;

    return 0;
}
