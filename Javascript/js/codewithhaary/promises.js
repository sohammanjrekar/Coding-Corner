

// 1. Promise with setTimeout
// Creating a promise
const promise1 = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve("Step 2: Asynchronous operation (Promise resolution with setTimeout)");
    }, 2000);
});

// Handling promise resolution
promise1.then((result) => {
    console.log(result);
});

console.log("Step 3: Asynchronous operation (Promise with setTimeout)");

// 2. Immediate Promise Resolution
console.log("Step 1: Asynchronous operation (Immediate Promise Resolution)");

// Creating a promise that resolves immediately
const promise2 = Promise.resolve("Step 2: Asynchronous operation (Immediate Promise Resolution)");

// Handling promise resolution
promise2.then((result) => {
    console.log(result);
});

console.log("Step 3: Asynchronous operation (Immediate Promise Resolution)");

// 3. Promise with Fetch API
console.log("Step 1: Asynchronous operation (Promise with Fetch API)");

// Using fetch to make an asynchronous request
const promise3 = fetch("https://jsonplaceholder.typicode.com/posts/1");

// Handling promise resolution
promise3.then(response => response.json())
    .then(data => {
        console.log("Step 2: Asynchronous operation (Promise resolution with Fetch API)", data);
    })
    .catch(error => {
        console.error("Error:", error);
    });

console.log("Step 3: Asynchronous operation (Promise with Fetch API)");
