var moment = require('moment');

var add = function (x, y) {
  return `The sum of ${x} & ${y} is: ${x + y}`;
}
var mul = function (x, y) {
  return `The multiplication of ${x} & ${y} is: ${x * y}`;
}

var currentDate = moment().format("dddd, MMMM Do YYYY, h:mm:ss a");

module.exports.add = add;
module.exports.mul = mul;
module.exports.currentDate = currentDate;