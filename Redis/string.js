const client = require('./client');

// Function to get the value of a specific key
async function getBike(id) {
    const result = await client.get(id);
    console.log("GET Result:", result);
}

// Function to set the value of a specific key
async function setBike(id, value) {
    const result = await client.set(id, value);
    console.log("SET Result:", result);
}

// Function to set multiple keys and their values at once
async function multiSetBikes(...keyValuePairs) {
    const result = await client.mset(...keyValuePairs);
    console.log("MSET Result:", result);
}

// Function to get the values of multiple keys at once
async function multiGetBikes(...keys) {
    const result = await client.mget(...keys);
    console.log("MGET Result:", result);
}

// Function to increment the value of a key by 1
async function incrementCount() {
    const result = await client.incr('count');
    console.log("INCR Result:", result);
}

// Function to increment the value of a key by a specific amount
async function incrementBy(key, value) {
    const result = await client.incrby(key, value);
    console.log("INCRBY Result:", result);
}

// Function to increment the value of a key by a specific floating point number
async function incrementByFloat(key, value) {
    const result = await client.incrbyfloat(key, value);
    console.log("INCRBYFLOAT Result:", result);
}

// Function to decrement the value of a key by 1
async function decrementCount() {
    const result = await client.decr('count');
    console.log("DECR Result:", result);
}

// Function to decrement the value of a key by a specific amount
async function decrementBy(key, value) {
    const result = await client.decrby(key, value);
    console.log("DECRBY Result:", result);
}

// Function to set a key's value only if it does not already exist
async function setIfNotExists(key, value) {
    const result = await client.setnx(key, value);
    console.log("SETNX Result:", result);
}

// Function to set multiple keys and values only if none of them already exist
async function multiSetIfNotExists(...keyValuePairs) {
    const result = await client.msetnx(...keyValuePairs);
    console.log("MSETNX Result:", result);
}

// Function to get a substring of the value stored at a key
async function getSubstring(key, start, end) {
    const result = await client.getrange(key, start, end);
    console.log("GETRANGE Result:", result);
}

// Function to overwrite part of the value stored at a key, starting at a specific offset
async function setSubstring(key, offset, value) {
    const result = await client.setrange(key, offset, value);
    console.log("SETRANGE Result:", result);
}

// Function to set a key to expire after a specific number of seconds
async function expireData(key, sec) {
    const result = await client.expire(key, sec);
    console.log("Expire Result:", result);
}

// Function to append a string to the value of a key
async function appendData(key, value) {
    const result = await client.append(key, value);
    console.log("APPEND Result:", result);
}

// Function to get the value of a key and then delete it
async function getAndDelete(key) {
    const result = await client.getdel(key);
    console.log("GETDEL Result:", result);
}

// Function to get the value of a key and set its expiration time
async function getAndExpire(key, seconds) {
    const result = await client.getex(key, 'EX', seconds);
    console.log("GETEX Result:", result);
}

// Function to get the previous value of a key and set it to a new value
async function getAndSet(key, value) {
    const result = await client.getset(key, value);
    console.log("GETSET Result:", result);
}

// Function to set a key with a value and expiration time in milliseconds
async function setWithExpiryInMs(key, value, milliseconds) {
    const result = await client.psetex(key, milliseconds, value);
    console.log("PSETEX Result:", result);
}

// Function to set a key with a value and expiration time in seconds
async function setWithExpiry(key, value, seconds) {
    const result = await client.setex(key, seconds, value);
    console.log("SETEX Result:", result);
}

// Function to get the length of the string value stored at a key
async function getLength(key) {
    const result = await client.strlen(key);
    console.log("STRLEN Result:", result);
}

// Call functions to test them
getBike('bike:1'); // Get the value of 'bike:1'

setBike('bike:4', 'soham'); // Set the value of 'bike:4' to 'soham'

multiSetBikes('bike:4', 'soham5', 'bike:5', 'soham6'); // Set multiple keys and values

multiGetBikes('bike:1', 'bike:2', 'bike:3', 'bike:4', 'bike:5'); // Get the values of multiple keys

incrementCount(); // Increment the value of 'count' by 1

incrementBy('count', 10); // Increment the value of 'count' by 10

incrementByFloat('count', 2.5); // Increment the value of 'count' by 2.5

decrementCount(); // Decrement the value of 'count' by 1

decrementBy('count', 5); // Decrement the value of 'count' by 5

setIfNotExists('bike:6', 'soham7'); // Set 'bike:6' to 'soham7' only if 'bike:6' does not exist

multiSetIfNotExists('bike:7', 'value7', 'bike:8', 'value8'); // Set multiple keys and values only if none of them exist

getSubstring('bike:4', 0, 4); // Get a substring of 'bike:4' from index 0 to 4

setSubstring('bike:4', 5, 'updated'); // Overwrite part of 'bike:4' starting at index 5 with 'updated'

expireData('bike:5', 5); // Set 'bike:5' to expire in 5 seconds

appendData('bike:4', ' appended'); // Append ' appended' to the value of 'bike:4'

getAndDelete('bike:6'); // Get the value of 'bike:6' and then delete it

getAndExpire('bike:4', 10); // Get the value of 'bike:4' and set its expiration time to 10 seconds

getAndSet('bike:4', 'new value'); // Get the previous value of 'bike:4' and set it to 'new value'

setWithExpiryInMs('bike:9', 'value with ms expiry', 5000); // Set 'bike:9' with a value and expiration time in milliseconds

setWithExpiry('bike:10', 'value with expiry', 20); // Set 'bike:10' with a value and expiration time in seconds

getLength('bike:4'); // Get the length of the value stored at 'bike:4'
