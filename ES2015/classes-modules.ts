class Account{
    id;
    name;
    balance;
    constructor(id:number, name: string, balance: number){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    totalBalance(){
        return this.balance;
    }
}

class SavingAccount extends Account{
    constructor(id: number, name: string, balance: number, interest: number){
        super(id, name, balance = balance + (balance*interest)/100);
    }
}

class CurrentAccount extends Account{
    constructor(id: number, name: string, balance: number, cash_credit: number){
        super(id, name, balance = balance - cash_credit);
    }
}

let savingsAccount = new SavingAccount(1357, "Surya", 300000, 5);
let currentAccount = new CurrentAccount(2468, "Surya", 300000, 2500);
let savingsAccount1 = new SavingAccount(1246, "Vijay", 500000, 4.75);
let currentAccount1 = new CurrentAccount(2579, "Vijay", 500000, 100000);

console.log(savingsAccount.totalBalance());
console.log(currentAccount.totalBalance());
console.log(savingsAccount1.totalBalance());
console.log(currentAccount1.totalBalance());