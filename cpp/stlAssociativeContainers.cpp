#include <iostream>
#include <set>
#include <map>
using namespace std;
int main() {
    // 1. Set
    set<int> mySet = {10, 20, 30, 40, 50};
    mySet.insert(20); // Duplicate values are ignored
    mySet.insert(60);
    cout << "Set: ";
    for (int s : mySet) {
        cout << s << " ";
    }
    cout << endl;

    // 2. Map
    map<int, string> myMap;
    myMap[1] = "One";
    myMap[2] = "Two";
    myMap[3] = "Three";
    cout << "Map: ";
    for (const auto& [key, value] : myMap) {
        cout << "(" << key << ", " << value << ") ";
    }
    cout << endl;

    // 3. Multiset
    multiset<int> myMultiset = {10, 20, 20, 30, 40};
    myMultiset.insert(20); // Duplicate values are allowed
    cout << "Multiset: ";
    for (int ms : myMultiset) {
        cout << ms << " ";
    }
    cout << endl;

    // 4. Multimap
    multimap<int, string> myMultimap;
    myMultimap.insert({1, "One"});
    myMultimap.insert({2, "Two"});
    myMultimap.insert({2, "Second Two"});
    myMultimap.insert({3, "Three"});
    cout << "Multimap: ";
    for (const auto& [key, value] : myMultimap) {
        cout << "(" << key << ", " << value << ") ";
    }
    cout << endl;

    return 0;
}
