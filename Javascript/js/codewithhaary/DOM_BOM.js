// DOM (Document Object Model):
// - The DOM represents the structure of an HTML document as a tree of objects.
// - It provides a structured way to access, manipulate, and update the content and structure of a webpage.
// - Each HTML element, attribute, text node, etc., is represented as an object in the DOM tree.

// Example:
// Accessing an element by its ID and changing its content
let elementById = document.getElementById("example");
if (elementById) {
    elementById.innerHTML = "Updated content using DOM";
}

// BOM (Browser Object Model):
// - The BOM represents everything about the browser where the webpage runs, excluding the actual document being displayed.
// - It includes objects like window, history, location, navigator, and screen, which allow interaction with the browser.
//Ex : alert , prompt ,confirm
// Example:
// Accessing browser information using BOM properties
console.log("Browser width: " + window.innerWidth);
console.log("Browser height: " + window.innerHeight);
console.log("Current URL: " + window.location.href);
location.href="http:/google.com/"

