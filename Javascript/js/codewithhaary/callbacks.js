
// Synchronous Execution:
alert("Step 1: Synchronous operation");
alert("Step 2: Synchronous operation");
alert("Step 3: Synchronous operation");

// Asynchronous Execution:
alert("Step 1: Asynchronous operation (setTimeout)");

setTimeout(() => {
    alert("Step 2: Asynchronous operation (setTimeout callback)");
}, 2000);

alert("Step 3: Asynchronous operation (setTimeout)");

// Callbacks:
// - Callbacks are functions passed as arguments to another function and executed after some asynchronous operation completes.
// - They are used to handle asynchronous operations in JavaScript.

// Example of a callback function
function fetchData(callback) {
    setTimeout(() => {
        const data = "Data received";
        callback(data); // Callback function executed
    }, 2000);
}

// Usage of callback function
function processData(data) {
    console.log("Processing data:", data);
}

fetchData(processData);


// Promises:
// - Promises represent the eventual completion or failure of an asynchronous operation and its resulting value.
// - They provide a cleaner alternative to callback-based asynchronous code.

// Example of a promise
function fetchData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = "Data received";
            resolve(data); // Resolve the promise with data
        }, 2000);
    });
}

// Usage of promises
fetchData()
    .then(data => {
        console.log("Data:", data);
    })
    .catch(error => {
        console.error("Error:", error);
    });


// Async/Await:
// - Async/await is a modern approach to handle asynchronous code in a more synchronous-like manner.
// - Async functions return a promise implicitly, and `await` is used to wait for the promise to resolve or reject.

// Example of async/await
async function fetchData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = "Data received";
            resolve(data); // Resolve the promise with data
        }, 2000);
    });
}

// Usage of async/await
async function processData() {
    try {
        const data = await fetchData(); // Wait for the promise to resolve
        console.log("Data:", data);
    } catch (error) {
        console.error("Error:", error);
    }
}

processData();

// Summary:
// - Callbacks are traditional and can lead to callback hell.
// - Promises provide better error handling and chaining.
// - Async/await offers cleaner and more readable asynchronous code, making it easier to write and understand asynchronous operations.
