const client = require('./client');

// SETBIT Command
async function setBit(key, offset, value) {
    const result = await client.setbit(key, offset, value);
    console.log("SETBIT Result:", result);
}

// GETBIT Command
async function getBit(key, offset) {
    const result = await client.getbit(key, offset);
    console.log("GETBIT Result:", result);
}

// BITCOUNT Command
async function bitCount(key, start = 0, end = -1) {
    const result = await client.bitcount(key, start, end);
    console.log("BITCOUNT Result:", result);
}

// BITPOS Command
async function bitPosition(key, bit, start = 0, end = -1) {
    const result = await client.bitpos(key, bit, start, end);
    console.log("BITPOS Result:", result);
}

// BITOP Command
async function bitOp(operation, destKey, ...sourceKeys) {
    const result = await client.bitop(operation, destKey, ...sourceKeys);
    console.log("BITOP Result:", result);
}

// BITFIELD Command
async function bitField(key, ...commands) {
    const result = await client.bitfield(key, ...commands);
    console.log("BITFIELD Result:", result);
}

// Example usage
async function example() {
    // SETBIT Example
    await setBit("mybitmap", 0, 1);

    // GETBIT Example
    await getBit("mybitmap", 0);

    // BITCOUNT Example
    await bitCount("mybitmap");

    // BITPOS Example
    await bitPosition("mybitmap", 1);

    // BITOP Example
    await bitOp("AND", "result", "bitmap1", "bitmap2");

    // BITFIELD Example
    await bitField("mybitmap", "GET", "u4", "0");
}

// Run the example
example().then(() => {
    // Close the client connection
    client.quit();
}).catch(console.error);
