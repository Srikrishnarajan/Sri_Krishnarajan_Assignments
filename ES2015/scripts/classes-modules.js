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
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    Account.prototype.totalBalance = function () {
        return this.balance;
    };
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, name, balance, interest) {
        return _super.call(this, id, name, balance = balance + (balance * interest) / 100) || this;
    }
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, balance, cash_credit) {
        return _super.call(this, id, name, balance = balance - cash_credit) || this;
    }
    return CurrentAccount;
}(Account));
var savingsAccount = new SavingAccount(1357, "Surya", 300000, 5);
var currentAccount = new CurrentAccount(2468, "Surya", 300000, 2500);
var savingsAccount1 = new SavingAccount(1246, "Vijay", 500000, 4.75);
var currentAccount1 = new CurrentAccount(2579, "Vijay", 500000, 100000);
console.log(savingsAccount.totalBalance());
console.log(currentAccount.totalBalance());
console.log(savingsAccount1.totalBalance());
console.log(currentAccount1.totalBalance());
//# sourceMappingURL=classes-modules.js.map