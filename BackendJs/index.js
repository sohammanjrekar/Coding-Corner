// const express = require("express");
// const app = express();
// const port = 3000;

// app.get("/", (req, res) => {
//   res.send("hello world");
// });

// app.listen(port, () => {
//   console.log(`App listing on port ${port}`);
// });
var express = require("express");
var app = express();

var things = require("./things.js");
require("dotenv").config();

//both index.js and things.js should be in same directory
app.use("/", things);

app.listen(process.env.PORT);
