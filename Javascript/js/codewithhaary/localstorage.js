// Set a value in localStorage
localStorage.setItem("username", "John Doe");

// Get a value from localStorage
const username = localStorage.getItem("username");
console.log("Username:", username);

// Check if a key exists in localStorage
const isAdmin = localStorage.getItem("isAdmin") !== null;
console.log("Is Admin:", isAdmin);

// Remove a key from localStorage
localStorage.removeItem("username");

// Clear all items from localStorage
localStorage.clear();
