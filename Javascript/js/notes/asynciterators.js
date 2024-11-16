// 1. Basic Async Iterator Example

// 1.1. An async iterator function that simulates fetching data with a delay
async function* fetchDataAsync() {
    // Simulate fetching the first piece of data after 1 second
    yield new Promise(resolve => setTimeout(() => resolve("Data 1 fetched"), 1000));

    // Simulate fetching the second piece of data after 1 second
    yield new Promise(resolve => setTimeout(() => resolve("Data 2 fetched"), 1000));

    // Simulate fetching the third piece of data after 1 second
    yield new Promise(resolve => setTimeout(() => resolve("Data 3 fetched"), 1000));
}

// 1.2. Using the async iterator with for-await-of loop
async function fetchAllData() {
    for await (const data of fetchDataAsync()) {
        console.log(data);  // Output: Data 1 fetched, Data 2 fetched, Data 3 fetched
    }
}

fetchAllData();  // Call the function to fetch all data

// 2. Async Iterators with Real-Life Data (Simulate API calls)

// 2.1. An async iterator function simulating an API that paginates data
async function* getPaginatedData() {
    let page = 1;

    while (page <= 3) {
        // Simulating an API call to get data for the page
        yield new Promise(resolve => setTimeout(() => resolve(`Page ${page} data fetched`), 1000));
        page++;
    }
}

// 2.2. Using the async iterator to fetch paginated data
async function fetchPaginatedData() {
    for await (const pageData of getPaginatedData()) {
        console.log(pageData);  // Output: Page 1 data fetched, Page 2 data fetched, Page 3 data fetched
    }
}

fetchPaginatedData();  // Call to fetch paginated data

// 3. Error Handling in Async Iterators

// 3.1. An async iterator that throws an error after some data
async function* fetchDataWithError() {
    yield new Promise(resolve => setTimeout(() => resolve("Data 1 fetched"), 1000));

    // Simulating an error during the second fetch
    throw new Error("Something went wrong while fetching data");

    yield new Promise(resolve => setTimeout(() => resolve("Data 2 fetched"), 1000));
}

// 3.2. Using try-catch block to handle error in async iterator
async function fetchWithErrorHandling() {
    try {
        for await (const data of fetchDataWithError()) {
            console.log(data);  // Will only print "Data 1 fetched"
        }
    } catch (error) {
        console.log(`Error: ${error.message}`);  // Output: Error: Something went wrong while fetching data
    }
}

fetchWithErrorHandling();  // Call function with error handling

// 4. Using Async Iterators with Real API-like Data (Simulating an Async Pagination API)

// 4.1. Simulating fetching data from an API with multiple pages
async function* fetchDataFromAPI() {
    let page = 1;
    while (page <= 3) {
        // Simulating an API delay
        yield new Promise(resolve => setTimeout(() => resolve(`Data from page ${page}`), 1000));
        page++;
    }
}

// 4.2. Iterating through the async iterator with a for-await-of loop
async function getDataFromAPI() {
    for await (const data of fetchDataFromAPI()) {
        console.log(data);  // Output: Data from page 1, Data from page 2, Data from page 3
    }
}

getDataFromAPI();  // Call function to simulate fetching data from API

// 5. Custom Async Iterator Example with Async Generators

// 5.1. Custom Async Iterator using an async generator function
async function* customAsyncIterator() {
    const values = [10, 20, 30, 40, 50];

    for (let i = 0; i < values.length; i++) {
        // Simulate an async operation (e.g., an API call or database query)
        yield new Promise(resolve => setTimeout(() => resolve(values[i]), 1000));
    }
}

// 5.2. Iterating through the custom async iterator using a for-await-of loop
async function processCustomAsyncIterator() {
    for await (const value of customAsyncIterator()) {
        console.log(`Processed value: ${value}`);  // Output: Processed value: 10, 20, 30, 40, 50
    }
}

processCustomAsyncIterator();  // Call to process custom async iterator

// 6. Using `return` and `throw` with Async Generators

// 6.1. Async Generator with return statement
async function* asyncGeneratorWithReturn() {
    yield "Data 1 fetched";
    yield "Data 2 fetched";
    return "Done fetching data";  // Returning a value after iterating
}

// 6.2. Handling the return value from an async generator
async function fetchWithReturn() {
    const iterator = asyncGeneratorWithReturn();
    
    for await (const data of iterator) {
        console.log(data);  // Output: Data 1 fetched, Data 2 fetched
    }

    // The return value of the generator is available after the iteration
    const result = await iterator.next(); 
    console.log(result.value);  // Output: Done fetching data
}

fetchWithReturn();  // Call to process async generator with return

// 7. Async Iterator with a Delay (Simulate an Asynchronous Operation)

async function* delayedIterator() {
    const values = ["Item 1", "Item 2", "Item 3"];

    for (const value of values) {
        // Simulate async delay before yielding the next value
        await new Promise(resolve => setTimeout(resolve, 1000));
        yield value;
    }
}

// 7.2. Iterate with a delay and log the results
async function logDelayedItems() {
    for await (const item of delayedIterator()) {
        console.log(item);  // Output: Item 1, Item 2, Item 3 (with 1 second delay between each)
    }
}

logDelayedItems();  // Call to process the delayed async iterator

