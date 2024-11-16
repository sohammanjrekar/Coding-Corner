// Set a value in sessionStorage
sessionStorage.setItem("username", "John Doe");

// Get a value from sessionStorage
const username = sessionStorage.getItem("username");
console.log("Username:", username);

// Check if a key exists in sessionStorage
const isAdmin = sessionStorage.getItem("isAdmin") !== null;
console.log("Is Admin:", isAdmin);

// Remove a key from sessionStorage
sessionStorage.removeItem("username");

// Clear all items from sessionStorage
sessionStorage.clear();
