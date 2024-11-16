http = require("node:http");
listener = function (req, res) {
  res.writeHead(200, { "Content-Type": "text/html" });
  res.end("<h2>himali</h2>");
};
server = http.createServer(listener);
server.listen(5000);

console.log("hii i am start");
