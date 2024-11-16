const multer = require("multer");
const express = require("express");
const app = express();

// Configure storage engine
const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    // Destination is used to specify the path of the directory in which the files have to be stored
    cb(null, "./uploads");
  },
  filename: function (req, file, cb) {
    // It is the filename that is given to the saved file.
    cb(null, file.originalname);
  },
});

// Create multer instance with storage configuration
const upload = multer({ storage: storage });

// Handle POST request for file upload
app.post("/upload", upload.single("myFile"), (req, res) => {
  console.log("Body: ", req.body);
  console.log("File: ", req.file);
  res.send("File successfully uploaded.");
});

// Start the server
app.listen(3000, () => {
  console.log("Server is running on port 3000");
});
