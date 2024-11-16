// Object-Oriented Programming (OOP) Example in JavaScript

// Abstract class representing a Shape
class Shape {
    constructor() {
        if (new.target === Shape) {
            throw new Error('Cannot instantiate abstract class');
        }
    }

    // Abstract method to calculate area (must be implemented by subclasses)
    calculateArea() {
        throw new Error('Method "calculateArea" must be implemented');
    }
}

// Subclass Circle inheriting from Shape
class Circle extends Shape {
    constructor(radius) {
        super();
        this.radius = radius;
    }

    // Override calculateArea method to calculate area of a circle
    calculateArea() {
        return Math.PI * this.radius ** 2;
    }
}

// Subclass Rectangle inheriting from Shape
class Rectangle extends Shape {
    constructor(width, height) {
        super();
        this.width = width;
        this.height = height;
    }

    // Override calculateArea method to calculate area of a rectangle
    calculateArea() {
        return this.width * this.height;
    }
}

// Create objects of Circle and Rectangle classes
const circle = new Circle(5);
const rectangle = new Rectangle(4, 6);

// Polymorphism: Call calculateArea method on different shapes
console.log("Area of circle:", circle.calculateArea()); // Output: Area of circle: 78.53981633974483
console.log("Area of rectangle:", rectangle.calculateArea()); // Output: Area of rectangle: 24

// Encapsulation: Properties are encapsulated within the classes and accessed using methods
console.log("Circle radius:", circle.radius); // Output: undefined (direct access to radius property is prevented)
console.log("Rectangle width:", rectangle.width); // Output: undefined (direct access to width property is prevented)
console.log("Rectangle height:", rectangle.height); // Output: undefined (direct access to height property is prevented)

// Inheritance: Subclasses inherit properties and methods from the superclass
console.log("Circle instanceof Shape:", circle instanceof Shape); // Output: true
console.log("Rectangle instanceof Shape:", rectangle instanceof Shape); // Output: true
