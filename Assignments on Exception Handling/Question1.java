//Program to handle ArithmeticException when there is an attempt to divide a number by zero
package co.skr;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		
		try {
		    int quotient = dividend / divisor;
		    System.out.println("The resulting quotient of this arithmetic operation is "+quotient);
		}catch(ArithmeticException e) {
		    System.out.println("Error: "+e);
		}
		sc.close();
	}

}
