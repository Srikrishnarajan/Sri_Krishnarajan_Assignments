//Program to find total cash in the Bank
package co.skr;

import java.util.ArrayList;

class Bank {
	public int totalCashInBank(ArrayList<Integer> cash) {
    	int total = 0;
    	
        for(int i = 0; i < cash.size(); i++)
               total += cash.get(i);
        return total;
    }
	
    public int getCash(){
    	return 0;
	}
}

class CurrentAccount extends Bank {
    int totalDeposits = 9828;
    int creditLimit = 1500;
    
    @Override public int getCash() {
    	return totalDeposits - creditLimit;
    }
}

class SavingsAccount extends Bank {
    int totalDeposits = 9828;
    int fixedDepositAmount = 3500;
    
    @Override public int getCash() {
    	return totalDeposits + fixedDepositAmount;
    }
}

public class Question3 {

	public static void main(String[] args) {
		CurrentAccount curAccount = new CurrentAccount();
    	SavingsAccount sbAccount = new SavingsAccount();
    	
    	int curAmount = curAccount.getCash();
    	int sbAmount = sbAccount.getCash();
    	
    	ArrayList<Integer> cash = new ArrayList<Integer>(2);
    	cash.add(curAmount);
    	cash.add(sbAmount);
    	
    	Bank b = new Bank();
    	System.out.println("Total cash in the Bank is "+b.totalCashInBank(cash));
	}

}
