#include <iostream>
using namespace std;
// A pure virtual function in C++ is a virtual function that has no implementation in the base class and must be implemented by derived classes. It is declared by assigning = 0 to the function in the base class. Classes containing pure virtual functions are called abstract classes and cannot be instantiated.


class Shape {
public:
    virtual void draw() = 0; // Pure virtual function
};

class Circle : public Shape {
public:
    void draw() override { // Must implement draw()
        cout << "Drawing Circle" << endl;
    }
};

class Square : public Shape {
public:
    void draw() override { // Must implement draw()
        cout << "Drawing Square" << endl;
    }
};

int main() {
    Shape* shape1 = new Circle();
    Shape* shape2 = new Square();

    shape1->draw(); // Output: Drawing Circle
    shape2->draw(); // Output: Drawing Square

    delete shape1;
    delete shape2;

    return 0;
}
