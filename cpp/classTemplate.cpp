#include <iostream>
using namespace std;
template <class T>
T sum(T a, T b)
{
    return a + b;
}
int main()
{
    int x = 5, y = 10;
    double z = 3.5, w = 7.8;
    string str1 = "Hello, ", str2 = "World!";
    cout << "Sum of integers: " << sum(x, y) << endl;
    cout << "Sum of doubles: " << sum(z, w) << endl;
    cout << "Sum of strings: " << sum(str1, str2) << endl;

    return 0;
}