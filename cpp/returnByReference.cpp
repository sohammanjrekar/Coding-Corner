#include <iostream>
using namespace std;
int num;
int& test(){
    return num;
}
int main() {
    test()=42;
    cout<<num;
    return 0;
}
