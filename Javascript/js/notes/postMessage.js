// // Get reference to the button
// var btn = document.getElementById("btn");

// // Open a child window (receiver)
// var childWindow = window.open("receiver.html", "_blank");

// // Set up the button click listener to send the message
// btn.addEventListener("click", function () {
//     sendMessage("Hello from Parent!");
// });

// // Function to send a JSON message to the child window
// function sendMessage(message) {
//     if (!message || !message.length) return; // Only send if the message is not empty

//     // Send the message as a JSON string
//     childWindow.postMessage(JSON.stringify({
//         message: message,
//         time: new Date().toISOString() // Add a timestamp
//     }), '*'); // '*' allows any origin, but ideally specify the receiver's origin
// }


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
