// 1. Basic Syntax of Arrow Functions

// 1.1 Single Parameter, Implicit Return (No need for parentheses or 'return')
const square = num => num * num;
console.log(square(5));  // Output: 25

// 1.2 Multiple Parameters, Implicit Return
const add = (a, b) => a + b;
console.log(add(3, 4));  // Output: 7

// 1.3 No Parameters, Implicit Return
const greet = () => console.log('Hello, World!');
greet();  // Output: Hello, World!

// 2. Arrow Function with Block Body (Explicit Return)

// When the function body has multiple statements, you need curly braces and 'return'
const addNumbers = (a, b) => {
    const sum = a + b;
    return sum;
};
console.log(addNumbers(10, 5));  // Output: 15

// 3. Using Arrow Functions with Array Methods

// 3.1 Using map() - Transform array elements (Array of squares)
const numbers = [1, 2, 3, 4];
const squaredNumbers = numbers.map(num => num * num);
console.log(squaredNumbers);  // Output: [1, 4, 9, 16]

// 3.2 Using filter() - Filter even numbers
const evenNumbers = numbers.filter(num => num % 2 === 0);
console.log(evenNumbers);  // Output: [2, 4]

// 3.3 Using reduce() - Calculate the sum of the array
const sum = numbers.reduce((acc, num) => acc + num, 0);
console.log(sum);  // Output: 10

// 4. Arrow Function with Object Literals

// 4.1 Returning an object literal (must use parentheses)
const createPerson = (name, age) => ({ name, age });
console.log(createPerson('Alice', 30));  // Output: { name: 'Alice', age: 30 }

// 5. Difference in `this` Context

// 5.1 Regular function with `this` binding
const regularFunction = {
    name: 'Regular Function',
    greet: function() {
        console.log(`Hello from ${this.name}`);
    }
};
regularFunction.greet();  // Output: Hello from Regular Function

// 5.2 Arrow function with `this` binding (Arrow functions don't bind `this`)
const arrowFunction = {
    name: 'Arrow Function',
    greet: () => {
        console.log(`Hello from ${this.name}`);  // 'this' refers to the surrounding scope, not the object
    }
};
arrowFunction.greet();  // Output: Hello from undefined (in strict mode, 'this' is undefined)

// 6. Arrow Function with `arguments` (No `arguments` object)

// 6.1 Regular function using `arguments` object
function sumNumbers() {
    let total = 0;
    for (let i = 0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;
}
console.log(sumNumbers(1, 2, 3, 4));  // Output: 10

// 6.2 Arrow function (No `arguments`, use rest parameters)
const sumArrow = (...args) => args.reduce((acc, num) => acc + num, 0);
console.log(sumArrow(1, 2, 3, 4));  // Output: 10

// 7. Arrow Functions Cannot Be Used as Constructors

// 7.1 Regular function as constructor
function Person(name, age) {
    this.name = name;
    this.age = age;
}
const john = new Person('John', 30);
console.log(john);  // Output: Person { name: 'John', age: 30 }

// 7.2 Arrow function cannot be used as a constructor
const PersonArrow = (name, age) => {
    this.name = name;
    this.age = age;
};
// Throws an error: PersonArrow is not a constructor
// const jane = new PersonArrow('Jane', 25);

// 8. Arrow Function in Event Handlers

// 8.1 Using regular function in an event handler
const button1 = document.createElement('button');
button1.innerHTML = 'Click me';
button1.addEventListener('click', function() {
button1.style.backgroundColor = 'blue';
});
document.body.appendChild(button1);

// 8.2 Using arrow function in an event handler
const button2 = document.createElement('button');
button2.innerHTML = 'Click me too';
button2.addEventListener('click', () => {
    console.log(this.innerHTML);  // 'this' refers to the surrounding scope, not the button
});
document.body.appendChild(button2);
