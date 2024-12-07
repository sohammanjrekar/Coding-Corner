#include <iostream>
using namespace std;

template <typename T>
T getMax(T a, T b) {
    return (a > b) ? a : b;
}

int main() {
    cout << "Max of 10 and 20: " << getMax(10, 20) << endl;       // Works for int
    cout << "Max of 5.5 and 2.3: " << getMax(5.5, 2.3) << endl; // Works for double
    cout << "Max of 'A' and 'Z': " << getMax('A', 'Z') << endl; // Works for char

    return 0;
}
