"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Acct = /** @class */ (function () {
    function Acct(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    Acct.prototype.totalBal = function () {
        return this.balance;
    };
    return Acct;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount(id, name, balance, interest) {
        return _super.call(this, id, name, balance = balance + (balance * interest) / 100) || this;
    }
    return SavingsAccount;
}(Acct));
var CurAccount = /** @class */ (function (_super) {
    __extends(CurAccount, _super);
    function CurAccount(id, name, balance, cash_credit) {
        return _super.call(this, id, name, balance = balance - cash_credit) || this;
    }
    return CurAccount;
}(Acct));
var savingAccount = new SavingsAccount(1357, "Surya", 400000, 5);
var curAccount = new CurAccount(2468, "Surya", 400000, 100000);
console.log(savingAccount.totalBal());
console.log(curAccount.totalBal());
//# sourceMappingURL=typescript-classes.js.map