#include <iostream>
using namespace std;
int fib(int n){
if(n<=1){
    return n;
}
 return fib(n-2)+fib(n-1);   
}

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << "The " << n << "th Fibonacci number is: " << fib(n) << endl;
    return 0;
}
