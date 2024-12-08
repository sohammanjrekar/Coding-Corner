#include <iostream>
#include <string>
using namespace std;
// General template
template <typename T>
T sum(T a, T b) {
    return a + b; // Works for types that support '+' operator
}

// Specialization for string
template <>
string sum<string>(string a, string b) {
    return a +" | "+ b; // String concatenation
}

int main() {
    int x = 5, y = 10;
    double z = 3.5, w = 7.8;
    string str1 = "Hello", str2 = "World";

    cout << "Sum of integers: " << sum(x, y) << endl;
    cout << "Sum of doubles: " << sum(z, w) << endl;
    cout << "Sum of strings: " << sum(str1, str2) << endl;

    return 0;
}
