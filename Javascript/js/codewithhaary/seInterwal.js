// This line displays an alert dialog with the message "hello"
alert("hello");

// This function sets a timeout to execute the provided function after a specified delay (in milliseconds)
setTimeout(function(){
    // Inside the function passed to setTimeout, we have another alert dialog
    alert("i am inside in timeout");
}, 2000); // The delay is 2000 milliseconds, which is 2 seconds

// setInterval is a function that repeatedly executes a provided function at specified intervals
// Here, setInterval is not used in this example, but I'll add a brief explanation
// Set the initial color to black
// Set the initial color to black
document.querySelector("h1").style.color = "black";

// Set up setInterval to toggle the color every 5 seconds
setInterval(function() {
    // Get the current color of the h1 element
    var currentColor = document.querySelector("h1").style.color;

    // If the current color is black, change it to red; otherwise, change it to black
    if (currentColor === "black") {
        document.querySelector("h1").style.color = "red";
    } else {
        document.querySelector("h1").style.color = "black";
    }
}, 2000);

