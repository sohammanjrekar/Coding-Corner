// In JavaScript, every object has a prototype, which acts as a template for that object. The prototype is an object itself and contains properties and methods that are shared among all instances of a particular object type. 
// Constructor function for creating Person objects
function Person(name, age) {
    this.name = name;
    this.age = age;
}

// Adding a method to the Person prototype
Person.prototype.greet = function() {
    console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
};

// Creating instances of Person
const person1 = new Person("Alice", 30);
const person2 = new Person("Bob", 25);

// Calling the greet method on person1 and person2
person1.greet(); // Output: Hello, my name is Alice and I am 30 years old.
person2.greet(); // Output: Hello, my name is Bob and I am 25 years old.

let a={
    name:"haary",
    language:"javascript"
}
console.log(a);
let p={
    run:()=>{
        console.log(run);
        
    }
}
a.__proto__=p
a.run()
 

// Prototype chaining in JavaScript refers to the process by which objects inherit properties and methods from their prototype, which in turn may have its own prototype, creating a chain of inheritance. This allows for hierarchical organization of objects and enables sharing of functionality across multiple objects

// Define a parent constructor function
function Animal(name) {
    this.name = name;
}

// Add a method to the Animal prototype
Animal.prototype.sound = function() {
    console.log(`${this.name} makes a sound`);
};

// Define a child constructor function inheriting from Animal
function Dog(name, breed) {
    Animal.call(this, name); // Call the parent constructor to initialize properties
    this.breed = breed;
}

// Set up prototype chain: Dog prototype inherits from Animal prototype
Dog.prototype = Object.create(Animal.prototype);
Dog.prototype.constructor = Dog; // Reset the constructor property

// Add a method to the Dog prototype
Dog.prototype.bark = function() {
    console.log(`${this.name} barks`);
};

// Create an instance of Dog
const dog = new Dog('Buddy', 'Golden Retriever');

// Call methods inherited from Animal prototype
dog.sound(); // Output: Buddy makes a sound

// Call method defined in Dog prototype
dog.bark(); // Output: Buddy barks
