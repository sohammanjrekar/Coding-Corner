// Listen for messages from the parent window
window.addEventListener("message", function(event) {
    // Optional: Check the origin to verify the sender (security measure)
    if (event.origin !== "http://your-parent-window-origin.com") {
        console.warn("Message from untrusted origin:", event.origin);
        return;
    }

    try {
        // Parse the incoming message (it should be a JSON string)
        var data = JSON.parse(event.data);

        // Display the received message and time
        console.log("Received message:", data.message);
        console.log("Received time:", data.time);
    } catch (e) {
        console.error("Failed to parse message:", e);
    }
});
