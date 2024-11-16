const client = require('./client');

// Redis hashes are maps between string fields and string values. They are useful for storing objects or representing data structures.

// Function to delete one or more fields and their values from a hash
async function deleteHashFields(hashKey, ...fields) {
    const result = await client.hdel(hashKey, ...fields);
    console.log("HDEL Result:", result);
}

// Function to determine whether a field exists in a hash
async function fieldExists(hashKey, field) {
    const result = await client.hexists(hashKey, field);
    console.log("HEXISTS Result:", result);
}

// Function to get the value of a field in a hash
async function getHashField(hashKey, field) {
    const result = await client.hget(hashKey, field);
    console.log("HGET Result:", result);
}

// Function to get all fields and values in a hash
async function getAllHashFields(hashKey) {
    const result = await client.hgetall(hashKey);
    console.log("HGETALL Result:", result);
}

// Function to increment the integer value of a field in a hash by a number
async function incrementHashFieldByInteger(hashKey, field, incrementBy) {
    const result = await client.hincrby(hashKey, field, incrementBy);
    console.log("HINCRBY Result:", result);
}

// Function to increment the floating point value of a field in a hash by a number
async function incrementHashFieldByFloat(hashKey, field, incrementBy) {
    const result = await client.hincrbyfloat(hashKey, field, incrementBy);
    console.log("HINCRBYFLOAT Result:", result);
}

// Function to get all fields in a hash
async function getAllHashKeys(hashKey) {
    const result = await client.hkeys(hashKey);
    console.log("HKEYS Result:", result);
}

// Function to get the number of fields in a hash
async function hashLength(hashKey) {
    const result = await client.hlen(hashKey);
    console.log("HLEN Result:", result);
}

// Function to get the values of all fields in a hash
async function getAllHashValues(hashKey) {
    const result = await client.hmget(hashKey);
    console.log("HMGET Result:", result);
}

// Function to set the values of multiple fields in a hash
async function setMultipleHashFields(hashKey, fieldValues) {
    const result = await client.hmset(hashKey, fieldValues);
    console.log("HMSET Result:", result);
}

// Function to get one or more random fields from a hash
async function getRandomHashFields(hashKey, count) {
    const result = await client.hrandfield(hashKey, count);
    console.log("HRANDFIELD Result:", result);
}

// Function to iterate over fields and values of a hash
async function scanHash(hashKey, cursor, match = "*", count = 10) {
    const result = await client.hscan(hashKey, cursor, "MATCH", match, "COUNT", count);
    console.log("HSCAN Result:", result);
}

// Function to create or modify the value of a field in a hash
async function setHashField(hashKey, field, value) {
    const result = await client.hset(hashKey, field, value);
    console.log("HSET Result:", result);
}

// Function to set the value of a field in a hash only if it doesn't exist
async function setHashFieldIfNotExists(hashKey, field, value) {
    const result = await client.hsetnx(hashKey, field, value);
    console.log("HSETNX Result:", result);
}

// Function to get the length of the value of a field in a hash
async function getHashFieldLength(hashKey, field) {
    const result = await client.hstrlen(hashKey, field);
    console.log("HSTRLEN Result:", result);
}

// Function to get all values in a hash
async function getAllHashFieldValues(hashKey) {
    const result = await client.hvals(hashKey);
    console.log("HVALS Result:", result);
}

// Call functions to test them

// Delete fields from a hash
deleteHashFields("user:123", "name", "age"); // Deletes 'name' and 'age' fields from 'user:123'

// Check if a field exists in a hash
fieldExists("user:123", "email"); // Checks if 'email' field exists in 'user:123'

// Get the value of a field in a hash
getHashField("user:123", "name"); // Gets the value of 'name' field from 'user:123'

// Get all fields and values in a hash
getAllHashFields("user:123"); // Gets all fields and values from 'user:123'

// Increment the value of a field in a hash by an integer
incrementHashFieldByInteger("user:123", "age", 1); // Increments the 'age' field in 'user:123' by 1

// Increment the value of a field in a hash by a float
incrementHashFieldByFloat("user:123", "weight", 2.5); // Increments the 'weight' field in 'user:123' by 2.5

// Get all fields in a hash
getAllHashKeys("user:123"); // Gets all keys in 'user:123'

// Get the number of fields in a hash
hashLength("user:123"); // Gets the number of fields in 'user:123'

// Get the values of all fields in a hash
getAllHashValues("user:123"); // Gets all values in 'user:123'

// Set multiple fields in a hash
setMultipleHashFields("user:123", { "name": "John", "age": 30 }); // Sets 'name' and 'age' in 'user:123' to "John" and 30 respectively

// Get random fields from a hash
getRandomHashFields("user:123", 2); // Gets two random fields from 'user:123'

// Iterate over fields and values of a hash
scanHash("user:123", 0); // Scans over fields and values of 'user:123'

// Set a field in a hash
setHashField("user:123", "email", "john@example.com"); // Sets 'email' field in 'user:123' to "john@example.com"

// Set a field in a hash only if it doesn't exist
setHashFieldIfNotExists("user:123", "name", "John Doe"); // Sets 'name' field in 'user:123' to "John Doe" only if it doesn't exist

// Get the length of a field value in a hash
getHashFieldLength("user:123", "email"); // Gets the length of the value of 'email' field in 'user:123'

// Get all values in a hash
getAllHashFieldValues("user:123"); // Gets all values in 'user:123'
