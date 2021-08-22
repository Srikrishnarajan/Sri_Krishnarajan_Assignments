var fs = require('fs');
var fileName = 'info.txt'
var wordToFind = process.argv[2];


fs.readFile(fileName, 'utf8', function(err, data) {  
    if (err) 
        throw err;

    var wordsArray = data.split(' ');
    var filteredWords = wordsArray.filter(function(word){
        return word.includes(wordToFind);
    });

    console.log(`The word "${wordToFind}" appears ${filteredWords.length} times in the text.`);
});