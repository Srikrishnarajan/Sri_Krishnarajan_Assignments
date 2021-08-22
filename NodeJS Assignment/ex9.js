var fs = require('fs');
var textArray = fs.readFileSync('info.txt', 'utf8').split(" ");
for(let i in textArray){
    console.log(textArray[i]);
}