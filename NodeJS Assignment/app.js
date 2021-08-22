var calculator = require('./calculator.js');
var sum = require('./operations/sum.js');
var multiplication = require('./operations/multiplication.js');
var substraction = require('./operations/substraction.js');
var division = require('./operations/division.js');

console.log(calculator.add(3,7));
console.log(calculator.mul(3,7));

console.log('Today is: '+calculator.currentDate);

console.log(sum.sum(3,7));
console.log(multiplication.multiply(3,7));
console.log(substraction.subt(3,7));
console.log(division.divide(3,7));