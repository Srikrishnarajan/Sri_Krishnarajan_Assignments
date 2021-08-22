class Acct{
    constructor (public id: number , public name:string ,  public balance:number){

    }
    totalBal(){
         return this.balance;

    }

}
class SavingsAccount extends Acct{
    constructor(id: number , name:string , balance:number, interest: number){
        super(id ,name ,balance= balance+(balance*interest)/100);
    }
}
class CurAccount extends Acct{
    constructor(id: number , name:string , balance:number , cash_credit: number){
        super(id ,name ,balance= balance-cash_credit);

    }

}
let savingAccount =new SavingsAccount(1357,"Surya",400000,5);
let curAccount =new CurAccount(2468,"Surya",400000,100000);

console.log(savingAccount.totalBal());
console.log(curAccount.totalBal());