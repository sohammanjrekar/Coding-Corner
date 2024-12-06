#include <iostream>
using namespace std;
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    for(int num:arr){
        cout << num << " ";
    }
    arr[2]=45;
    for(int num:arr){
        cout << num << " ";
    }
    return 0;
}
