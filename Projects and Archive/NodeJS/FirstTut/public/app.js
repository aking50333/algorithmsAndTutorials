var fs = require('fs');

fs.writeFileSync("file.txt", "Hello world");

console.log(fs.readFileSync("file.txt").toString());