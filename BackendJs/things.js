var express = require("express");
var router = express.Router();
var data = require("./joke.json");
router.get("/api/jokes", function (req, res) {
  res.json(data);
});

module.exports = router;
