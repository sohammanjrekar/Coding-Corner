#include <iostream>
using namespace std;

class Base {
public:
    virtual void show() { // Virtual function
        cout << "Base class" << endl;
    }
};

class Derived : public Base {
public:
    void show() override { // Overrides base class function
        cout << "Derived class" << endl;
    }
};

int main() {
    Base* ptr;
    Derived d;
    ptr = &d;
    ptr->show(); // Calls Derived's show() due to virtual
    return 0;
}
