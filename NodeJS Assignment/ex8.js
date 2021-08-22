var fs = require('fs');
var fileName = process.argv[2];

fs.readFile(fileName, 'utf8', function(err, data) {  
    if (err) 
        throw err;

    var num = data.split(' ').map(function(n){
            return parseInt(n);
        }
    );

    var sum = num.reduce(function(prevNo, curNo){
        return prevNo + curNo;
    });
    
    console.log('The sum of numbers in numbers.txt file is: '+sum);
});