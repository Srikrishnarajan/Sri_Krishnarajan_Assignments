"use strict";
var circle = {
    print: function () {
        return "Circle Object implementing Printable Interface...";
    }
};
var employee = {
    print: function () {
        return "Employee Object implementing Printable Interface...";
    }
};
function printAll() {
    var objectsArray = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        objectsArray[_i] = arguments[_i];
    }
    for (var i in objectsArray) {
        console.log(objectsArray[i].print());
    }
}
printAll(circle, employee);
//# sourceMappingURL=typescript-interfaces.js.map