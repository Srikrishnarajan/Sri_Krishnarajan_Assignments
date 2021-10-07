//Program to check whether the given number is Armstrong or not
package co.skr;

import java.util.Scanner;

public class Question1 {

	public static boolean isArmstrong(int value) {
		int actualNumber = 0, remainder, sum = 0;
		actualNumber = value;
		
		while(value > 0) {
			remainder = value % 10;
			sum += (remainder * remainder * remainder);
			value /= 10;
		}
		
		return sum == actualNumber;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		System.out.println("Is "+number+" an Armstrong number? "+isArmstrong(number));
	}

}
