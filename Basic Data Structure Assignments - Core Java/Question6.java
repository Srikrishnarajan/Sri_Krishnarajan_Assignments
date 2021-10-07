//CUI application program
package co.skr;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int attempts = 1;
    	
		while(attempts <= 3) {
			if(attempts > 1) {
				System.out.println("Attempt: "+attempts);
			}
			
			System.out.print("Username: ");
			String userId = sc.nextLine();
			System.out.print("Password: ");
			String password = sc.nextLine();
			
			if(userId.equalsIgnoreCase("User")) {
				if(password.equalsIgnoreCase("Password")){
					System.out.print("Welcome, "+userId);
					break;
				}
			}
			
			attempts++;
			
			if(attempts > 3) {
				System.out.print("Contact Admin");
			}
		}
		sc.close();
	}
	
}
