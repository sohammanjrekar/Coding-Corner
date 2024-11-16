const client = require('./client');

// Appends a new message to a stream. Creates the key if it doesn't exist.
async function addMessageToStream(key, message) {
    const result = await client.xadd(key, "MAXLEN", "~", 100, "*", "message", message);
    console.log("XADD Result:", result);
}

// Returns the number of messages that were successfully acknowledged by the consumer group member of a stream.
async function acknowledgedMessagesCount(stream, group, consumer) {
    const result = await client.xack(stream, group, consumer);
    console.log("XACK Result:", result);
}

// Changes, or acquires, ownership of messages in a consumer group, as if the messages were delivered to as consumer group member.
async function autoClaimMessages(stream, group, consumer, minIdleTime, count, consumerName) {
    const result = await client.xautoclaim(stream, group, consumer, minIdleTime, count, consumerName);
    console.log("XAUTOCLAIM Result:", result);
}


// Changes, or acquires, ownership of a message in a consumer group, as if the message was delivered a consumer group member.
async function claimMessage(stream, group, consumer, minIdleTime, messageId) {
    const result = await client.xclaim(stream, group, consumer, minIdleTime, messageId);
    console.log("XCLAIM Result:", result);
}

// Returns the number of messages after removing them from a stream.
async function deleteMessages(stream, ...ids) {
    const result = await client.xdel(stream, ...ids);
    console.log("XDEL Result:", result);
}

// Creates a consumer group.
async function createConsumerGroup(stream, group, id) {
    const result = await client.xgroup("CREATE", stream, group, id, "MKSTREAM");
    console.log("XGROUP CREATE Result:", result);
}

// Creates a consumer in a consumer group.
async function createConsumer(stream, group, consumer) {
    const result = await client.xgroup("CREATECONSUMER", stream, group, consumer);
    console.log("XGROUP CREATECONSUMER Result:", result);
}

// Deletes a consumer from a consumer group.
async function deleteConsumer(stream, group, consumer) {
    const result = await client.xgroup("DELCONSUMER", stream, group, consumer);
    console.log("XGROUP DELCONSUMER Result:", result);
}

// Destroys a consumer group.
async function destroyConsumerGroup(stream, group) {
    const result = await client.xgroup("DESTROY", stream, group);
    console.log("XGROUP DESTROY Result:", result);
}

// Sets the last-delivered ID of a consumer group.
async function setConsumerGroupID(stream, group, id) {
    const result = await client.xgroup("SETID", stream, group, id);
    console.log("XGROUP SETID Result:", result);
}

// Returns a list of the consumers in a consumer group.
async function listConsumers(stream, group) {
    const result = await client.xinfo("CONSUMERS", stream, group);
    console.log("XINFO CONSUMERS Result:", result);
}

// Returns a list of the consumer groups of a stream.
async function listConsumerGroups(stream) {
    const result = await client.xinfo("GROUPS", stream);
    console.log("XINFO GROUPS Result:", result);
}

// Returns information about a stream.
async function streamInfo(stream) {
    const result = await client.xinfo("STREAM", stream);
    console.log("XINFO STREAM Result:", result);
}

// Return the number of messages in a stream.
async function streamLength(stream) {
    const result = await client.xlen(stream);
    console.log("XLEN Result:", result);
}

// Returns the information and entries from a stream consumer group's pending entries list.
async function pendingEntries(stream, group) {
    const result = await client.xpending(stream, group);
    console.log("XPENDING Result:", result);
}

// Returns the messages from a stream within a range of IDs.
async function rangeByID(stream, start, end) {
    const result = await client.xrange(stream, start, end);
    console.log("XRANGE Result:", result);
}

// Returns messages from multiple streams with IDs greater than the ones requested. Blocks until a message is available otherwise.
async function readStreams(count, ...streams) {
    const result = await client.xread("COUNT", count, "STREAMS", ...streams);
    console.log("XREAD Result:", result);
}

// Returns new or historical messages from a stream for a consumer in a group. Blocks until a message is available otherwise.
async function readGroup(group, consumer, count, ...streams) {
    const result = await client.xreadgroup("GROUP", group, consumer, "COUNT", count, "STREAMS", ...streams);
    console.log("XREADGROUP Result:", result);
}

// Returns the messages from a stream within a range of IDs in reverse order.
async function reverseRangeByID(stream, start, end) {
    const result = await client.xrevrange(stream, start, end);
    console.log("XREVRANGE Result:", result);
}

// An internal command for replicating stream values.
async function setStreamID(key, id) {
    const result = await client.xsetid(key, id);
    console.log("XSETID Result:", result);
}

// Deletes messages from the beginning of a stream.
async function trimStream(key, maxLen) {
    const result = await client.xtrim(key, "MAXLEN", "~", maxLen);
    console.log("XTRIM Result:", result);
}

// Example usage
async function example() {
    await addMessageToStream("mystream", "Hello, world!");
    await acknowledgedMessagesCount("mystream", "mygroup", "consumer1");
    await autoClaimMessages("mystream", "mygroup", "consumer1", 60000, 10, "consumer1");
    await claimMessage("mystream", "mygroup", "consumer1", 60000, "message-id");
    await deleteMessages("mystream", "message-id");
    await createConsumerGroup("mystream", "mygroup", "$");
    await createConsumer("mystream", "mygroup", "consumer2");
    await deleteConsumer("mystream", "mygroup", "consumer2");
    await destroyConsumerGroup("mystream", "mygroup");
    await setConsumerGroupID("mystream", "mygroup", "0");
    await listConsumers("mystream", "mygroup");
    await listConsumerGroups("mystream");
    await streamInfo("mystream");
    await streamLength("mystream");
    await pendingEntries("mystream", "mygroup");
    await rangeByID("mystream", "-", "+");
    await readStreams(10, "mystream");
    await readGroup("mygroup", "consumer1", 10, "mystream");
    await reverseRangeByID("mystream", "+", "-");
    await setStreamID("mystream", "0");
    await trimStream("mystream", 1000);
}
// Run the example
example().then(() => {
    // Close the client connection
    client.quit();
}).catch(console.error);
