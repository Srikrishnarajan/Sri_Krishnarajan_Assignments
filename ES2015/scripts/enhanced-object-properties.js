"use strict";
var Order = {
    id: 1001,
    title: "Chocolate",
    price: 100,
    printOrder: function () {
        return this.id + " " + this.title;
    },
    getPrice: function () {
        return this.price;
    }
};
/*let copyOrder = Object.assign({}, Order);
console.log(copyOrder);*/ 
//# sourceMappingURL=enhanced-object-properties.js.map