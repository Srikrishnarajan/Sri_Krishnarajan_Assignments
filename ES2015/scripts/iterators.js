"use strict";
var armstrongNumbers = [1, 153, 370, 371, 407];
var iterator = armstrongNumbers[Symbol.iterator]();
function getNextArmstrong() {
    return iterator.next().value;
}
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
console.log(getNextArmstrong());
//# sourceMappingURL=iterators.js.map