const client = require('./client');

// Adds one or more members to a sorted set, or updates their scores. Creates the key if it doesn't exist.
async function addToSortedSet(key, score, member) {
    const result = await client.zadd(key, score, member);
    console.log("ZADD Result:", result);
}

// Returns the number of members in a sorted set.
async function sortedSetCardinality(key) {
    const result = await client.zcard(key);
    console.log("ZCARD Result:", result);
}

// Returns the count of members in a sorted set that have scores within a range.
async function countMembersInScoreRange(key, min, max) {
    const result = await client.zcount(key, min, max);
    console.log("ZCOUNT Result:", result);
}

// Returns the difference between multiple sorted sets.
async function differenceOfSortedSets(destination, numKeys, ...keys) {
    const result = await client.zdiffstore(destination, numKeys, ...keys);
    console.log("ZDIFFSTORE Result:", result);
}

// Increments the score of a member in a sorted set.
async function incrementScore(key, increment, member) {
    const result = await client.zincrby(key, increment, member);
    console.log("ZINCRBY Result:", result);
}

// Returns the intersect of multiple sorted sets.
async function intersectSortedSets(destination, numKeys, ...keys) {
    const result = await client.zinterstore(destination, numKeys, ...keys);
    console.log("ZINTERSTORE Result:", result);
}

// Returns the number of members in a sorted set within a lexicographical range.
async function countMembersInLexRange(key, min, max) {
    const result = await client.zlexcount(key, min, max);
    console.log("ZLEXCOUNT Result:", result);
}

// Removes members from one or more sorted sets after removing them. Deletes the sorted set if the last member was popped.
async function popMembersWithScores(max, ...keys) {
    const result = await client.zpopmax(max, ...keys);
    console.log("ZPOPMAX Result:", result);
}

// Returns one or more random members from a sorted set.
async function getRandomMembers(key, count) {
    const result = await client.zrandmember(key, count);
    console.log("ZRANDMEMBER Result:", result);
}

// Removes one or more members from a sorted set. Deletes the sorted set if all members were removed.
async function removeFromSortedSet(key, ...members) {
    const result = await client.zrem(key, ...members);
    console.log("ZREM Result:", result);
}

// Returns members in a sorted set within a range of indexes.
async function rangeByIndex(key, start, stop) {
    const result = await client.zrange(key, start, stop);
    console.log("ZRANGE Result:", result);
}

// Returns the score of a member in a sorted set.
async function scoreOfMember(key, member) {
    const result = await client.zscore(key, member);
    console.log("ZSCORE Result:", result);
}

// Example usage
async function example() {
    await addToSortedSet("scores", 100, "John");
    await sortedSetCardinality("scores");
    await countMembersInScoreRange("scores", 0, 100);
    await differenceOfSortedSets("destination", 2, "set1", "set2");
    await incrementScore("scores", 10, "John");
    await intersectSortedSets("destination", 2, "set1", "set2");
    await countMembersInLexRange("scores", "-", "+");
    await popMembersWithScores(1, "set1");
    await getRandomMembers("scores", 2);
    await removeFromSortedSet("scores", "John");
    await rangeByIndex("scores", 0, -1);
    await scoreOfMember("scores", "John");
}

// Run the example
example().then(() => {
    // Close the client connection
    client.quit();
}).catch(console.error);
