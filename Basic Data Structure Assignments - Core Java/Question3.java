//Simple and Compound Interest Calculation program
package co.skr;

import java.util.Scanner;

class Interest {
	
	public double simpleInterest(double p, int n, double r){
    	double amount = (p * n * r)/100;
    	return amount;
    }
	
    public double compoundInterest(double p, int n, double r){
    	double amount = p * (Math.pow((1 + r / 100), n)) - p;
    	return amount;
    }
    
}

public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal: ");
		double principal = sc.nextDouble();
		System.out.print("Enter number of years: ");
		int numberOfYears = sc.nextInt();
		System.out.print("Enter rate of interest: ");
		double rateOfInterest = sc.nextDouble();
		sc.close();
		Interest obj = new Interest();
		
		System.out.println("Simple Interest: " +obj.simpleInterest(principal, numberOfYears, rateOfInterest));
		System.out.println("Compound Interest: " +obj.compoundInterest(principal, numberOfYears, rateOfInterest));
	}

}
