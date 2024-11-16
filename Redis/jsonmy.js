const client = require('./client');

// Check if client supports JSON module
if (!client.json) {
    console.error("Redis client does not support JSON module.");
    process.exit(1); // Exit the script with an error status
}

// Set a JSON value
async function setJSON(key, path, value) {
    await client.json.set(key, path, JSON.stringify(value));
}

// Get a JSON value
async function getJSON(key, path) {
    const result = await client.json.get(key, path);
    return JSON.parse(result);
}

// Delete a JSON value
async function deleteJSON(key, path) {
    await client.json.del(key, path);
}

// Example usage
async function example() {
    try {
        // Set a JSON value
        await setJSON("animal", "$", "dog");

        // Get the JSON value
        const animal = await getJSON("animal", "$");
        console.log("Animal:", animal);

        // Set a nested JSON value
        await setJSON("example", "$", [true, { "answer": 42 }, null]);

        // Get a nested JSON value
        const answer = await getJSON("example", "$[1].answer");
        console.log("Answer:", answer);

        // Delete a JSON value
        await deleteJSON("example", "$[-1]");
    } catch (error) {
        console.error("An error occurred:", error);
    } finally {
        // Close the client connection
        client.quit();
    }
}

// Run the example
example();
