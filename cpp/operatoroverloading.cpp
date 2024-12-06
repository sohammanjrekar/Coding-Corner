#include <iostream>
using namespace std;

class Point {
private:
    int x, y; // Coordinates

public:
    // Constructor
    Point(int x = 0, int y = 0) : x(x), y(y) {}

    // Overloading the '+' operator
    Point operator+(const Point& p) {
        return Point(x + p.x, y + p.y); // Add coordinates
    }

    // Display function
    void display() const {
        cout << "(" << x << ", " << y << ")" << endl;
    }
};

int main() {
    Point p1(3, 4);
    Point p2(1, 2);

    Point p3 = p1 + p2; // Using overloaded '+' operator

    cout << "Point 1: ";
    p1.display();

    cout << "Point 2: ";
    p2.display();

    cout << "Point 3 (Result of p1 + p2): ";
    p3.display();

    return 0;
}
