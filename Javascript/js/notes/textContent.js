// 1. Set text content of an existing element with the id 'para'
document.getElementById('para').textContent = 'Hello World!';

// 2. Create a new div element and add text content to it
var elem = document.createElement('div');
elem.textContent = 'Hello World!';

// 3. Append the newly created div element to the element with id 'para'
document.getElementById('para').appendChild(elem);

// 4. Add a new paragraph with text content and append it to the body
var newPara = document.createElement('p');
newPara.textContent = 'This is a new paragraph added dynamically!';
document.body.appendChild(newPara);

// 5. Change the background color of an element with id 'para'
document.getElementById('para').style.backgroundColor = 'lightblue';

// 6. Set multiple styles on an element using 'style' property
document.getElementById('para').style.cssText = 'color: red; font-size: 20px; padding: 10px;';

// 7. Create a new button and set a click event listener
var button = document.createElement('button');
button.textContent = 'Click me!';
button.addEventListener('click', function() {
    alert('Button clicked!');
});
document.body.appendChild(button);

// 8. Set an attribute for an existing element
document.getElementById('para').setAttribute('data-info', 'This is custom data');

// 9. Add a class to an element
document.getElementById('para').classList.add('highlight');

// 10. Remove a class from an element
document.getElementById('para').classList.remove('highlight');

// 11. Remove an element from the DOM
document.body.removeChild(newPara); // Removes the dynamically added paragraph

// 12. Replace the content of an existing element with new content
var newDiv = document.createElement('div');
newDiv.textContent = 'This is a new div replacing the old one!';
document.body.replaceChild(newDiv, elem); // Replaces 'elem' with 'newDiv'

// 13. Create a new list and append list items dynamically
var list = document.createElement('ul');
for (var i = 1; i <= 5; i++) {
    var listItem = document.createElement('li');
    listItem.textContent = 'Item ' + i;
    list.appendChild(listItem);
}
document.body.appendChild(list);

// 14. Add event listener for mouse hover to change background color
document.getElementById('para').addEventListener('mouseover', function() {
    this.style.backgroundColor = 'yellow';
});
document.getElementById('para').addEventListener('mouseout', function() {
    this.style.backgroundColor = ''; // Remove the background color when mouse leaves
});

// 15. Log the content of the 'para' element when clicked
document.getElementById('para').addEventListener('click', function() {
    console.log(this.textContent);
});
