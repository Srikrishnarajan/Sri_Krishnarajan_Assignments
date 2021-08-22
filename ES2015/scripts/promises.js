"use strict";
var p1 = new Promise(function (resolve, reject) {
    console.log('The first promise has resolved');
    resolve(64);
});
var p2 = new Promise(function (resolve, reject) {
    console.log('The second promise has resolved');
    resolve(76);
});
Promise.all([p1, p2]).then(function (results) {
    var total = results.reduce(function (p, c) { return p + c; });
    console.log("Results: " + results);
    console.log("Sum: " + total);
});
//# sourceMappingURL=promises.js.map