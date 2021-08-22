var fs = require("fs");

var p = "./";
fs.readdir(p, function(err, files){
    if (err) 
        throw err;
    
    files.forEach(function(file){
        if (fs.statSync(file).isDirectory()) 
            console.log ("DIR :"+file);
        else 
            console.log("FILE:"+file);
    });
});