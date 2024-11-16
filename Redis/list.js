const client = require('./client');

// Redis lists are linked lists of string values. Redis lists are frequently used to:
// - Implement stacks and queues.
// - Build queue management for background worker systems.

// Function to push an element to the head of a list (like a stack - LIFO)
async function leftPush(key, value) {
    const result = await client.lpush(key, value);
    console.log("LPUSH Result:", result);
}

// Function to push an element to the tail of a list (like a queue - FIFO)
async function rightPush(key, value) {
    const result = await client.rpush(key, value);
    console.log("RPUSH Result:", result);
}

// Function to remove and return the first element of a list
async function leftPop(key) {
    const result = await client.lpop(key);
    console.log("LPOP Result:", result);
}

// Function to remove and return the last element of a list
async function rightPop(key) {
    const result = await client.rpop(key);
    console.log("RPOP Result:", result);
}

// Function to get the length of a list
async function listLength(key) {
    const result = await client.llen(key);
    console.log("LLEN Result:", result);
}

// Function to atomically move elements from one list to another
async function listMove(source, destination, sourcePosition, destinationPosition) {
    const result = await client.lmove(source, destination, sourcePosition, destinationPosition);
    console.log("LMOVE Result:", result);
}

// Function to trim a list to the specified range of elements
async function listTrim(key, start, stop) {
    const result = await client.ltrim(key, start, stop);
    console.log("LTRIM Result:", result);
}

// Blocking commands

// Function to remove and return the first element of a list, blocking until an element is available or timeout is reached
async function blockingLeftPop(key, timeout) {
    const result = await client.blpop(key, timeout);
    console.log("BLPOP Result:", result);
}

// Function to atomically move elements from a source list to a target list, blocking until an element is available or timeout is reached
async function blockingListMove(source, destination, sourcePosition, destinationPosition, timeout) {
    const result = await client.blmove(source, destination, sourcePosition, destinationPosition, timeout);
    console.log("BLMOVE Result:", result);
}

// Call functions to test them

// Initial state: check if 'bikes:repairs' is empty
listLength("bikes:repairs"); // Returns the length of the list 'bikes:repairs'

// Add elements to 'bikes:repairs' (acting like a stack - LIFO)
leftPush("bikes:repairs", "bike:1"); // Adds 'bike:1' to the head of the list 'bikes:repairs'
leftPush("bikes:repairs", "bike:2"); // Adds 'bike:2' to the head of the list 'bikes:repairs'

// Move an element from 'bikes:repairs' to 'bikes:finished' (acting like a queue - FIFO)
listMove("bikes:repairs", "bikes:finished", "LEFT", "LEFT"); // Moves 'bike:2' from the head of 'bikes:repairs' to the head of 'bikes:finished'

// Verify the state of the lists
client.lrange("bikes:repairs", 0, -1).then(result => console.log("LRANGE bikes:repairs Result:", result)); // Returns all elements of 'bikes:repairs'
client.lrange("bikes:finished", 0, -1).then(result => console.log("LRANGE bikes:finished Result:", result)); // Returns all elements of 'bikes:finished'

// Limit the length of the list 'bikes:repairs' to the first 3 elements
listTrim("bikes:repairs", 0, 2); // Trims 'bikes:repairs' to keep only the first three elements

// Demonstrate blocking pop and move commands
blockingLeftPop("bikes:repairs", 10); // Blocks up to 10 seconds to remove and return the first element of the list 'bikes:repairs'
blockingListMove("bikes:repairs", "bikes:finished", "LEFT", "RIGHT", 10); // Blocks up to 10 seconds to move an element from the head of 'bikes:repairs' to the tail of 'bikes:finished'
