// let canvas = document.createElement("canvas");
// canvas.width = 700;
// canvas.height = 500;
// var ctx = canvas.getContext("2d");
// ctx.font = "90px Cursive";
// ctx.fillStyle = "red";
// ctx.fillText("Hello World", 80, 120);
// document.body.appendChild(canvas);



        // Step 1: Create a canvas dynamically
        let canvas = document.createElement("canvas");
        canvas.width = 700;
        canvas.height = 500;
        document.body.appendChild(canvas);

        // Step 2: Get the 2D context
        var ctx = canvas.getContext("2d");

        // Set canvas background color
        ctx.fillStyle = "#f0f0f0"; // Light gray background
        ctx.fillRect(0, 0, canvas.width, canvas.height);

        // Step 3: Draw Text with Styles
        ctx.font = "90px Cursive";
        ctx.fillStyle = "red";
        ctx.fillText("Hello World", 80, 120);

        // Step 4: Draw a Rectangle with a Solid Color
        ctx.fillStyle = "blue";
        ctx.fillRect(50, 150, 200, 100); // X, Y, Width, Height

        // Step 5: Draw a Circle (Arc)
        ctx.beginPath();
        ctx.arc(400, 300, 50, 0, Math.PI * 2, false); // (x, y, radius, startAngle, endAngle)
        ctx.fillStyle = "green";
        ctx.fill(); // Fill the circle with green
        ctx.lineWidth = 5;  // Set the border width
        ctx.strokeStyle = "black";
        ctx.stroke(); // Stroke the outline of the circle

        // Step 6: Draw a Line
        ctx.beginPath();
        ctx.moveTo(50, 350);  // Start point (x, y)
        ctx.lineTo(650, 350); // End point (x, y)
        ctx.strokeStyle = "purple";
        ctx.lineWidth = 3;
        ctx.stroke(); // Draw the line

        // Step 7: Draw a Gradient
        var gradient = ctx.createLinearGradient(50, 450, 650, 450);
        gradient.addColorStop(0, "yellow");
        gradient.addColorStop(1, "orange");
        ctx.fillStyle = gradient;
        ctx.fillRect(50, 450, 600, 30); // Gradient-filled rectangle

        // Step 8: Draw an Image
        var img = new Image();
        img.src = "https://www.pngmagic.com/product_images/nature-background-with-tropical-plants_84e.jpeg"; // Change this to an image URL
        img.onload = function() {
            ctx.drawImage(img, 250, 150, 150, 150); // Image position and size (x, y, width, height)
        };

        // Step 9: Animation: Move a rectangle across the canvas
        let rectX = 0;
        function animate() {
            ctx.clearRect(0, 0, canvas.width, canvas.height); // Clear canvas for animation
            ctx.fillStyle = "#f0f0f0";
            ctx.fillRect(0, 0, canvas.width, canvas.height); // Repaint background
            ctx.fillStyle = "blue";
            ctx.fillRect(rectX, 200, 100, 50); // Moving rectangle
            rectX += 2; // Move the rectangle by 2 pixels each frame
            if (rectX > canvas.width) rectX = -100; // Reset the rectangle position after it moves off screen
            requestAnimationFrame(animate); // Continue animation
        }
        animate(); // Start the animation loop

        // Step 10: Add Event Listener for Mouse Click
        canvas.addEventListener('click', function(event) {
            var x = event.offsetX;
            var y = event.offsetY;
            ctx.fillStyle = "black";
            ctx.fillText("Clicked at: " + x + ", " + y, x, y); // Display click position on the canvas
        });