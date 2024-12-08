#include <iostream>
#include <unordered_set>
#include <unordered_map>
using namespace std;
int main() {
    // 1. Unordered Set
    unordered_set<int> uset = {10, 20, 30, 40};
    uset.insert(50);
    uset.insert(20); // Duplicate values are ignored
    cout << "Unordered Set: ";
    for (int u : uset) {
        cout << u << " "; // Order is not guaranteed
    }
    cout << endl;

    // 2. Unordered Multiset
    unordered_multiset<int> umset = {10, 20, 20, 30};
    umset.insert(40);
    umset.insert(20); // Duplicate values are allowed
    cout << "Unordered Multiset: ";
    for (int um : umset) {
        cout << um << " "; // Order is not guaranteed
    }
    cout << endl;

    // 3. Unordered Map
    unordered_map<int, string> umap = {
        {1, "One"},
        {2, "Two"},
        {3, "Three"}};
    umap[4] = "Four"; // Insert a new key-value pair
    umap[2] = "Two Updated"; // Update the value for key 2
    cout << "Unordered Map: ";
    for (const auto& [key, value] : umap) {
        cout << "(" << key << ", " << value << ") ";
    }
    cout << endl;

    // 4. Unordered Multimap
    unordered_multimap<int, string> ummap;
    ummap.insert({1, "One"});
    ummap.insert({2, "Two"});
    ummap.insert({2, "Second Two"}); // Duplicate keys are allowed
    ummap.insert({3, "Three"});
    cout << "Unordered Multimap: ";
    for (const auto& [key, value] : ummap) {
        cout << "(" << key << ", " << value << ") ";
    }
    cout << endl;

    return 0;
}
