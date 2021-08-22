const fs = require('fs');

fs.readdir('./', (err, files) => {
    if (err)
        throw err;
    else{
        fs.readFile('ex11.txt', 'utf8', (err, data) => {
            if(err)
                throw err;
            else
                console.log(data);
        });
    }
});