const client = require('./client');

// Redis sets are unordered collections of unique strings. They support various set operations like union, intersection, and difference.

// Function to add one or more members to a set
async function addSetMembers(key, ...members) {
    const result = await client.sadd(key, ...members);
    console.log("SADD Result:", result);
}

// Function to get the number of members in a set
async function setCardinality(key) {
    const result = await client.scard(key);
    console.log("SCARD Result:", result);
}

// Function to get the difference of multiple sets
async function setDifference(...keys) {
    const result = await client.sdiff(...keys);
    console.log("SDIFF Result:", result);
}

// Function to store the difference of multiple sets in a key
async function storeSetDifference(destination, ...keys) {
    const result = await client.sdiffstore(destination, ...keys);
    console.log("SDIFFSTORE Result:", result);
}

// Function to get the intersection of multiple sets
async function setIntersection(...keys) {
    const result = await client.sinter(...keys);
    console.log("SINTER Result:", result);
}

// Function to get the number of members in the intersection of multiple sets
async function setIntersectionCardinality(...keys) {
    const result = await client.sintercard(...keys);
    console.log("SINTERCARD Result:", result);
}

// Function to store the intersection of multiple sets in a key
async function storeSetIntersection(destination, ...keys) {
    const result = await client.sinterstore(destination, ...keys);
    console.log("SINTERSTORE Result:", result);
}

// Function to determine if a member belongs to a set
async function isSetMember(key, member) {
    const result = await client.sismember(key, member);
    console.log("SISMEMBER Result:", result);
}

// Function to get all members of a set
async function getSetMembers(key) {
    const result = await client.smembers(key);
    console.log("SMEMBERS Result:", result);
}

// Function to determine if multiple members belong to a set
async function areSetMembers(key, ...members) {
    const result = await client.smismember(key, ...members);
    console.log("SMISMEMBER Result:", result);
}

// Function to move a member from one set to another
async function moveSetMember(source, destination, member) {
    const result = await client.smove(source, destination, member);
    console.log("SMOVE Result:", result);
}

// Function to remove and return one or more random members from a set
async function popSetMember(key, count) {
    const result = await client.spop(key, count);
    console.log("SPOP Result:", result);
}

// Function to get one or multiple random members from a set without removing them
async function getRandomSetMembers(key, count) {
    const result = await client.srandmember(key, count);
    console.log("SRANDMEMBER Result:", result);
}

// Function to remove one or more members from a set
async function removeSetMembers(key, ...members) {
    const result = await client.srem(key, ...members);
    console.log("SREM Result:", result);
}

// Function to iterate over members of a set
async function scanSetMembers(key, cursor, match = "*", count = 10) {
    const result = await client.sscan(key, cursor, "MATCH", match, "COUNT", count);
    console.log("SSCAN Result:", result);
}

// Function to get the union of multiple sets
async function setUnion(...keys) {
    const result = await client.sunion(...keys);
    console.log("SUNION Result:", result);
}

// Function to store the union of multiple sets in a key
async function storeSetUnion(destination, ...keys) {
    const result = await client.sunionstore(destination, ...keys);
    console.log("SUNIONSTORE Result:", result);
}

// Call functions to test them

// Add members to a set
addSetMembers("bikes:available", "bike:1", "bike:2", "bike:3"); // Adds 'bike:1', 'bike:2', and 'bike:3' to 'bikes:available'

// Get the number of members in the set
setCardinality("bikes:available"); // Returns the number of members in 'bikes:available'

// Get the difference between two sets
setDifference("bikes:available", "bikes:repairs"); // Returns the difference between 'bikes:available' and 'bikes:repairs'

// Store the difference between two sets in a new key
storeSetDifference("bikes:diff", "bikes:available", "bikes:repairs"); // Stores the difference in 'bikes:diff'

// Get the intersection of two sets
setIntersection("bikes:available", "bikes:finished"); // Returns the intersection of 'bikes:available' and 'bikes:finished'

// Get the number of members in the intersection of two sets
setIntersectionCardinality("bikes:available", "bikes:finished"); // Returns the number of members in the intersection

// Store the intersection of two sets in a new key
storeSetIntersection("bikes:intersect", "bikes:available", "bikes:finished"); // Stores the intersection in 'bikes:intersect'

// Check if a member belongs to a set
isSetMember("bikes:available", "bike:1"); // Checks if 'bike:1' is a member of 'bikes:available'

// Get all members of a set
getSetMembers("bikes:available"); // Returns all members of 'bikes:available'

// Check if multiple members belong to a set
areSetMembers("bikes:available", "bike:1", "bike:4"); // Checks if 'bike:1' and 'bike:4' are members of 'bikes:available'

// Move a member from one set to another
moveSetMember("bikes:available", "bikes:repairs", "bike:1"); // Moves 'bike:1' from 'bikes:available' to 'bikes:repairs'

// Remove and return a random member from a set
popSetMember("bikes:available", 1); // Removes and returns one random member from 'bikes:available'

// Get multiple random members from a set without removing them
getRandomSetMembers("bikes:available", 2); // Gets two random members from 'bikes:available' without removing them

// Remove one or more members from a set
removeSetMembers("bikes:available", "bike:2", "bike:3"); // Removes 'bike:2' and 'bike:3' from 'bikes:available'

// Iterate over members of a set
scanSetMembers("bikes:available", 0); // Iterates over members of 'bikes:available'

// Get the union of multiple sets
setUnion("bikes:available", "bikes:repairs"); // Returns the union of 'bikes:available' and 'bikes:repairs'

// Store the union of multiple sets in a new key
storeSetUnion("bikes:union", "bikes:available", "bikes:repairs"); // Stores the union in 'bikes:union'
