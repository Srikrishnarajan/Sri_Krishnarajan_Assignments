var fs = require('fs');
var fileName = "myText.txt";
var textToWrite = "hey ho! let's go";

fs.writeFile(fileName, textToWrite, function(err, data){
    if (err)
        throw err;
    else
        console.log('The file was saved!');
});

fs.readFile(fileName, 'utf-8', function(err, data){
    if (err)
        throw err;
    else
        console.log(data);
});