#include <iostream>
using namespace std;

// Abstract class
class Animal {
public:
    virtual void sound() = 0; // Pure virtual function
};

class Dog : public Animal {
public:
    void sound() override { // Must override
        cout << "Dog barks" << endl;
    }
};

class Cat : public Animal {
public:
    void sound() override { // Must override
        cout << "Cat meows" << endl;
    }
};

int main() {
    Animal* a1 = new Dog();
    Animal* a2 = new Cat();

    a1->sound(); // Output: Dog barks
    a2->sound(); // Output: Cat meows

    delete a1;
    delete a2;

    return 0;
}
