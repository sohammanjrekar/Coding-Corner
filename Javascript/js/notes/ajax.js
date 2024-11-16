  // ===============================
    // XMLHttpRequest Example (Classic AJAX)
    // ===============================

    // Get the button for the XMLHttpRequest
    var xhrButton = document.getElementById("btnXmlHttpRequest");
    xhrButton.addEventListener("click", function () {
        sendXmlHttpRequest();
    });

    // Function to send an AJAX request using XMLHttpRequest
    function sendXmlHttpRequest() {
        var xhttp = new XMLHttpRequest();

        // Define what happens when the request state changes
        xhttp.onreadystatechange = function () {
            // If request has finished and response is OK (200)
            if (xhttp.readyState === XMLHttpRequest.DONE && xhttp.status === 200) {
                // Display the response in the page
                document.getElementById("xhrResult").textContent = "XMLHttpRequest Response: " + xhttp.responseText;
            }
        };

        // Open a GET request to a text file (ajax_info.txt in this case)
        xhttp.open("GET", "ajax_info.txt", true); // 'true' makes it asynchronous
        xhttp.send(); // Send the request
    }

    // ================================
    // Fetch API Example (Modern AJAX)
    // ================================

    // Get the button for the Fetch request
    var fetchButton = document.getElementById("btnFetchRequest");
    fetchButton.addEventListener("click", function () {
        sendFetchRequest();
    });

    // Function to send an AJAX request using the Fetch API
    function sendFetchRequest() {
        fetch('/js/notes/')  // Make a GET request to the server's home page (adjust the URL as needed)
            .then(response => {
                if (response.ok) {
                    return response.text(); // Convert the response body to text
                } else {
                    throw new Error("Network response was not ok");
                }
            })
            .then(text => {
                // Display the response text (length in this case) on the page
                document.getElementById("fetchResult").textContent = "Fetch Response: " + text.length + " characters long. "+ text;
            })
            .catch(error => {
                // Handle errors (e.g., network issues, server errors)
                console.error("There was a problem with the fetch operation:", error);
                document.getElementById("fetchResult").textContent = "Error: " + error.message;
            });
    }