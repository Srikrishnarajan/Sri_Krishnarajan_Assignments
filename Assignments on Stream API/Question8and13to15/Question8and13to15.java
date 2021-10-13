package co.skr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question8and13to15 {

	public static void main(String[] args) {
		Trader t1 = new Trader("Krishna", "Bangalore");
        Trader t2 = new Trader("Pavan", "Pune");
        Trader t3 = new Trader("Yash", "Bangalore");
        Trader t4 = new Trader("Virat", "Delhi");
        Trader t5 = new Trader("Vijay", "Chennai");
        Trader t6 = new Trader("Sameer", "Pune");
        Trader t7 = new Trader("Gambhir", "Delhi");
        Trader t8 = new Trader("Sehwag", "Delhi");
        Trader t9 = new Trader("Suryakumar", "Indore");

        Transaction ts1 = new Transaction(t1, 2021, 10000);
        Transaction ts2 = new Transaction(t2, 2021, 5000);
        Transaction ts3 = new Transaction(t3, 2021, 7500);
        Transaction ts4 = new Transaction(t4, 2011, 10000);
        Transaction ts5 = new Transaction(t5, 2010, 50000);
        Transaction ts6 = new Transaction(t6, 2021, 2500);
        Transaction ts7 = new Transaction(t7, 2011, 25000);
        Transaction ts8 = new Transaction(t8, 2011, 30000);
        Transaction ts9 = new Transaction(t9, 2019, 20000);

        ArrayList<Transaction> transactions = new ArrayList<>();
        
        transactions.add(ts1);
        transactions.add(ts2);
        transactions.add(ts3);
        transactions.add(ts4);
        transactions.add(ts5);
        transactions.add(ts6);
        transactions.add(ts7);
        transactions.add(ts8);
        transactions.add(ts9);
        
        System.out.println(sortTransactions(transactions));
        System.out.println(transaction3sValuesDelhi(transactions));
        System.out.println(highestTransaction2(transactions));
        System.out.println(smallestTransaction1(transactions));
	}

	public static List<Transaction> sortTransactions(List<Transaction> transactions) {
        List<Transaction> sortedTrans= new ArrayList<>();
        
        sortedTrans = transactions.stream()
                .filter(p -> p.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toCollection(ArrayList::new));
        
        return sortedTrans;
    }

    public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
        List<Integer> transactionValueDelhi = new ArrayList<>();
        
        transactions.stream()
                .filter(p -> p.getTrader().getCity().equals("Delhi"))
                .forEach(p -> transactionValueDelhi.add(p.getValue()));
        
        System.out.println("------------------------------------------------------------------------------");
        return transactionValueDelhi;
    }
    
    public static int highestTransaction2(List<Transaction> transactions){
        int max = Integer.MIN_VALUE;
        List<Integer>list = new ArrayList<>();
        
        transactions.stream()
                .forEach(p -> list.add(p.getValue()));
        
        max = Collections.max(list);
        System.out.println("------------------------------------------------------------------------------");
        return max;
    }

    public static int smallestTransaction1(List<Transaction> transactions){
        int min = Integer.MAX_VALUE;
        List<Integer>list = new ArrayList<>();
        
        transactions.stream()
                .forEach(p -> list.add(p.getValue()));
        
        min = Collections.min(list);
        System.out.println("------------------------------------------------------------------------------");
        return min;
    }
}
