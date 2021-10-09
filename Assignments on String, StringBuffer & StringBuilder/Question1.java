//Program to determine the length of the string using string method
package co.skr;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("The length of the string entered is "+str.length());
		sc.close();
	}

}
