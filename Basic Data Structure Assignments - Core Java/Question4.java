//Declaring results based on the marks obtained by the student in three subjects program
package co.skr;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks for the first subject: ");
		double sub1Marks = sc.nextDouble();
		System.out.print("Enter marks for the second subject: ");
		double sub2Marks = sc.nextDouble();
		System.out.print("Enter marks for the third subject: ");
		double sub3Marks = sc.nextDouble();
		
		if(sub1Marks >= 60 && sub2Marks >= 60 && sub3Marks >= 60)
			System.out.println("Passed");
		else if(sub1Marks > 60 && sub2Marks > 60)
			System.out.println("Promoted");
		else if(sub2Marks > 60 && sub3Marks > 60)
			System.out.println("Promoted");
		else if(sub1Marks > 60 && sub3Marks > 60)
			System.out.println("Promoted");
		else if(sub1Marks < 60 && sub2Marks < 60 && sub3Marks < 60 || (sub1Marks >= 60 || sub2Marks >= 60 || sub3Marks >= 60))
			System.out.println("Failed");
		
		sc.close();
	}

}
