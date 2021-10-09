//Program to concatenate two strings using string method
package co.skr;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first half of the string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter last half of the string: ");
		String str2 = sc.nextLine();
		
		System.out.println("The resulting concatenated string is "+(str1+str2));
		sc.close();
	}

}
