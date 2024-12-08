#include <iostream>
#include <vector>
#include <algorithm> // For STL algorithms
#include <iterator>  // For ostream_iterator
using namespace std;
int main() {
    vector<int> vec = {10, 20, 30, 40, 50, 40, 30};

    // 1. Sort the vector
    sort(vec.begin(), vec.end());
    cout << "Sorted vector: ";
    for (int x : vec) cout << x << " ";
    cout << endl;

    // 2. Binary Search
    bool found = binary_search(vec.begin(), vec.end(), 30);
    cout << "Binary search for 30: " << (found ? "found" : "not found") << endl;

    // 3. Counting occurrences
    int count = std::count(vec.begin(), vec.end(), 40);
    cout << "Count of 40: " << count << endl;

    // 4. Transform elements
    vector<int> doubledVec;
    transform(vec.begin(), vec.end(), back_inserter(doubledVec), [](int x) { return x * 2; });
    cout << "Doubled values: ";
    for (int x : doubledVec) cout << x << " ";
    cout << endl;

    // 5. Find an element
    auto it = find(vec.begin(), vec.end(), 30);
    if (it != vec.end()) {
        cout << "Found 30 at position: " << distance(vec.begin(), it) << endl;
    }

    // 6. Reverse the vector
    reverse(vec.begin(), vec.end());
    cout << "Reversed vector: ";
    for (int x : vec) cout << x << " ";
    cout << endl;

    return 0;
}
