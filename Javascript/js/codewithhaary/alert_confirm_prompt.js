// Using confirm dialog
let result = confirm("Do you want to proceed?");
if (result) {
    alert("You clicked OK!");
} else {
    alert("You clicked Cancel!");
}

// Using prompt dialog to get user input
let name = prompt("Please enter your name:");
if (name !== null && name !== "") {
    alert("Hello, " + name + "!");
} else {
    alert("You did not enter your name!");
}

// Using alert to display a message
alert("This is an alert message!");

// Using document.write to write content directly to the HTML document
document.write("<h2>This is a heading written using document.write</h2>");
document.write("<p>This is a paragraph written using document.write.</p>");

// Using document.getElementById to get an element by its id and modify its content
let elementById = document.getElementById("demo");
if (elementById) {
    elementById.innerHTML = "This content is changed using document.getElementById";
} else {
    alert("Element with id 'demo' not found!");
}

// Using document.getElementsByClassName to get elements by their class and modify their content
let elementsByClass = document.getElementsByClassName("demo");
if (elementsByClass.length > 0) {
    for (let i = 0; i < elementsByClass.length; i++) {
        elementsByClass[i].innerHTML = "This content is changed using document.getElementsByClassName";
    }
} else {
    alert("Elements with class 'demo' not found!");
}
