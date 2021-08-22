var fs = require('fs');

fs.writeFile("test2.txt", "hey ho! let's go", function(err, data){
    if(err)
        throw err;
    console.log("The file was saved!");
});