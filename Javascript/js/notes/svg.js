 // Step 1: Create an SVG container element with the correct namespace
 var svg = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
 svg.setAttribute('width', '500');
 svg.setAttribute('height', '200');

 // Step 2: Create a text element inside the SVG with the correct namespace
 var text = document.createElementNS('http://www.w3.org/2000/svg', 'text');
 text.setAttribute('x', '0');
 text.setAttribute('y', '50');
 text.style.fontFamily = 'Times New Roman';
 text.style.fontSize = '50px'; // Add "px" for font size
 text.textContent = 'Hello world!';

 // Step 3: Append the text element to the SVG
 svg.appendChild(text);

 // Step 4: Append the SVG to the body of the document
 document.body.appendChild(svg);