  // Click event
  document.getElementById("box").addEventListener("click", function() {
    alert("You clicked the box!");
});

// Mouseover event
document.getElementById("box").addEventListener("mouseover", function() {
    this.style.backgroundColor = "blue";
});

// Mouseout event
document.getElementById("box").addEventListener("mouseout", function() {
    this.style.backgroundColor = "red";
});

// Keydown event
document.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        alert("You pressed Enter key!");
    }
});

// Submit event
document.querySelector("form").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevents the form from submitting
    alert("Form submitted!");
});

// Load event
window.addEventListener("load", function() {
    alert("Page loaded!");
});

// DOMContentLoaded event
document.addEventListener("DOMContentLoaded", function() {
    alert("DOM content loaded!");
});

// Scroll event
window.addEventListener("scroll", function() {
    console.log("Scrolled!");
});

// Resize event
window.addEventListener("resize", function() {
    console.log("Resized!");
});

// Focus event
document.getElementById("box").addEventListener("focus", function() {
    console.log("Focused!");
});

// Blur event
document.getElementById("box").addEventListener("blur", function() {
    console.log("Blurred!");
});

// Change event
document.getElementById("color").addEventListener("change", function() {
    var selectedColor = this.value;
    document.getElementById("box").style.backgroundColor = selectedColor;
});



 // Function to remove click event listener
 function removeClickListener() {
    document.getElementById("box").removeEventListener("click", handleClick);
    alert("Click event listener removed!");
}

 // Event handler function
 function handleClick(event) {
    // Accessing properties of the event object
    console.log("Event type:", event.type);  // Type of event (e.g., "click")
    console.log("Target element:", event.target);  // Element that triggered the event
    console.log("Mouse X position:", event.clientX);  // X position of the mouse pointer
    console.log("Mouse Y position:", event.clientY);  // Y position of the mouse pointer
}

// Adding click event listener to the button
document.getElementById("myButton").addEventListener("click", handleClick);