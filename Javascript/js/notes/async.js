// 1. Basic Example of an Async Function

// 1.1. Simple async function that returns a resolved Promise
async function greet() {
    return "Hello, world!";  // Implicitly wrapped in a Promise
}

greet().then(response => {
    console.log(response);  // Output: Hello, world!
});

// 2. Await with Promises

// 2.1. Simulating an asynchronous operation with setTimeout
const fetchData = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve("Data fetched successfully!");
    }, 2000);
});

// 2.2. Async function using await to wait for the Promise
async function getData() {
    const data = await fetchData;  // Pauses execution until the Promise resolves
    console.log(data);  // Output: Data fetched successfully!
}

getData();  // Calling the async function

// 3. Handling Errors in Async Functions using try/catch

// 3.1. A Promise that rejects to simulate an error
const fetchDataWithError = new Promise((resolve, reject) => {
    setTimeout(() => {
        reject("Something went wrong!");
    }, 2000);
});

// 3.2. Async function using try/catch for error handling
async function getDataWithError() {
    try {
        const data = await fetchDataWithError;
        console.log(data);
    } catch (error) {
        console.log(`Error: ${error}`);  // Output: Error: Something went wrong!
    }
}

getDataWithError();  // Call the async function

// 4. Multiple Await Calls (Sequential vs Parallel)

// 4.1. Sequential Await Calls
async function getDataSequential() {
    const firstData = await new Promise(resolve => setTimeout(() => resolve('First data'), 2000));
    console.log(firstData);  // Output: First data

    const secondData = await new Promise(resolve => setTimeout(() => resolve('Second data'), 1000));
    console.log(secondData);  // Output: Second data
}

getDataSequential();  // Call the async function

// 4.2. Parallel Await Calls using Promise.all
async function getDataParallel() {
    const promise1 = new Promise(resolve => setTimeout(() => resolve('First data'), 2000));
    const promise2 = new Promise(resolve => setTimeout(() => resolve('Second data'), 1000));

    // Waits for both promises to resolve in parallel
    const [firstData, secondData] = await Promise.all([promise1, promise2]);
    console.log(firstData);  // Output: First data
    console.log(secondData);  // Output: Second data
}

getDataParallel();  // Call the async function

// 5. Returning a Promise from an Async Function

// 5.1. Returning a value implicitly wrapped in a Promise
async function myAsyncFunction() {
    return "Returned from async function";  // This is automatically wrapped in a Promise
}

// 5.2. Handling the returned Promise using .then
myAsyncFunction().then(result => {
    console.log(result);  // Output: Returned from async function
});

// 6. Fetch API with Async/Await for Making HTTP Requests

// 6.1. Fetching data from an API using async/await
async function fetchUserData() {
    try {
        // Simulating a fetch operation to get user data
        const response = await fetch('https://jsonplaceholder.typicode.com/users/1');
        
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        
        const data = await response.json();
        console.log(data);  // Logs user data from the API
    } catch (error) {
        console.log('There was a problem with the fetch operation:', error);
    }
}

fetchUserData();  // Calling the async function to fetch data

// 7. Combining Async/Await with Other Promises

// 7.1. Simulating multiple promises to be resolved sequentially
async function processMultiplePromises() {
    const firstPromise = new Promise(resolve => setTimeout(() => resolve('Processed First'), 1000));
    const secondPromise = new Promise(resolve => setTimeout(() => resolve('Processed Second'), 2000));

    // Waiting for the promises to resolve sequentially
    const result1 = await firstPromise;
    console.log(result1);  // Output: Processed First

    const result2 = await secondPromise;
    console.log(result2);  // Output: Processed Second
}

processMultiplePromises();  // Call the async function

// 7.2. Using Promise.all for concurrent execution of multiple promises
async function processMultiplePromisesConcurrently() {
    const firstPromise = new Promise(resolve => setTimeout(() => resolve('Processed First'), 1000));
    const secondPromise = new Promise(resolve => setTimeout(() => resolve('Processed Second'), 1000));

    // Running the promises concurrently and waiting for all to finish
    const [result1, result2] = await Promise.all([firstPromise, secondPromise]);

    console.log(result1);  // Output: Processed First
    console.log(result2);  // Output: Processed Second
}

processMultiplePromisesConcurrently();  // Call the async function

// 8. Handling Timeouts and Delays with async/await

// 8.1. Function that mimics waiting for a certain amount of time (using setTimeout)
function delay(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

// 8.2. Using delay function inside an async function
async function performActionWithDelay() {
    console.log('Action started...');
    await delay(2000);  // Waits for 2 seconds
    console.log('Action completed after delay!');
}

performActionWithDelay();  // Call the async function with delay
