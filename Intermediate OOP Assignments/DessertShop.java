//Dessert Shop Application program - Question 7
package co.skr;

import java.util.Scanner;

abstract class DessertItem {
	abstract public int getCost();
}

class Candy extends DessertItem {	
	int cost = 60;
	
	public int getCost() {
		return cost;	
	}

	public int addCandies(int candies) {
		return candies;	
	}
}

class Cookie extends DessertItem {
	int cost = 70;
	
	public int addCookies(int cookies) {
		return cookies;
	} 
	
	public int getCost() {
		return cost;
	}
}

class IceCream extends DessertItem {
	int cost = 100;
	
	public int addIceCream(int icecream) {
		return icecream;
	} 
	
	public int getCost() {
		return cost;	
	}
}

public class DessertShop {
	
	public static void main(String[] args) {
		DessertShop ds = new DessertShop();
		ds.selectRoles();
	}
	
	private void selectRoles() {
		System.out.println("Select 1 for Owner\nSelect 2 for Customer");
		int choice;
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
    	switch(choice){
    		case 1:
    			roles("Owner");
    			break;
    		case 2:
    			roles("Customer");
    			break;
    		default:
    			System.out.println("Invalid Choice");
    			break;
    	}
    	sc.close();
	}
	
	private void roles(String role) {
		if(role == "Owner") {
			addItems();	
		}
		
		else if(role == "Customer") {
			placeOrder();	
		}
	}

	private void addItems() {
		System.out.println("Press 1 to add Candies\nPress 2 to add Cookies\nPress 3 to add IceCreams");
		int choice;
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice) {
    		case 1:
    			addItemsOperation(1);
    			break;
    		case 2:
    			addItemsOperation(2);
    			break;
    		case 3:
    			addItemsOperation(3);
    			break;
    		default:
    			System.out.println("Invalid choice");
    			break;
    	}
		sc.close();
	}
	
	private void addItemsOperation(int choice) {
		Scanner sc = new Scanner(System.in);
		
    	if(choice == 1) {
    		System.out.println("Enter number of candies: ");
    		int quantity = 0;
    		
    		if(sc.hasNext())
    			quantity = sc.nextInt();
    		
    		Candy item1 = new Candy();
    		System.out.println(item1.addCandies(quantity)+" new Candies were added successfully");
    	}
    		
    	else if(choice == 2) {
    		System.out.println("Enter number of cookies: ");
    		int quantity = 0;
    			
    		if(sc.hasNext())
    			quantity = sc.nextInt();
    		
    		Cookie item2 = new Cookie();
    		System.out.println(item2.addCookies(quantity)+" new Cookies were added successfully");
    	}
    	
    	else {
    		System.out.println("Enter number of ice creams: ");
    		int quantity = 0;
    		
			if(sc.hasNext())
				quantity = sc.nextInt();
			
    		IceCream item3 = new IceCream();
    		System.out.println(item3.addIceCream(quantity)+" new Ice creams were added successfully");
    	}
    	sc.close();
	}

	private void placeOrder() {
		System.out.println("Enter your choice:\n1. Candies\n2. Cookies\n3. Ice Cream");
		int choice;
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice) {
    		case 1:
    			placeOrderOperation(1);
    			break;
    		case 2:
    			placeOrderOperation(2);
    			break;
    		case 3:
    			placeOrderOperation(3);
    			break;
    		default:
    			System.out.println("Invalid choice");
    			break;
    	}
		sc.close();
	}

	private void placeOrderOperation(int choice) {
		Scanner sc = new Scanner(System.in);
		DessertItem di = null;
		
		if(choice == 1) {
    		System.out.println("Enter quantity: ");
    		try {
    			int quantity = 0;
    			
    			if(sc.hasNext())
    				quantity = sc.nextInt();
    			
    			di = new Candy();
    			int cash = quantity * di.getCost();
    			System.out.println("Amount to be paid in Rs. "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
		
		else if(choice == 2) {
    		System.out.println("Enter quantity: ");
    		try {
    			int quantity = 0;
    			
    			if(sc.hasNext())
    				quantity = sc.nextInt();
    			
    			di = new Cookie();
    			int cash = quantity * di.getCost();
    			System.out.println("Amount to be paid in Rs. "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
		
		else {
    		System.out.println("Enter quantity: ");
    		try {
    			int quantity = 0;
    			
    			if(sc.hasNext())
    				quantity = sc.nextInt();
    			
    			di = new IceCream();
    			int cash = quantity * di.getCost();
    			System.out.println("Amount to be paid in Rs. "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}	
    	}
    	sc.close();
	}

}
