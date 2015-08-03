var connect = require('connect');
var http = require('http');

var app = connect();

function doFirst(request, response, next) {
    console.log("Bacon");
}
function doSecond(request, response, next) {
    console.log("Tuna");
}

app.use('/profile', doFirst);
app.use('/forum', doSecond);

http.createServer(app).listen(8888);
console.log("Server is running");
