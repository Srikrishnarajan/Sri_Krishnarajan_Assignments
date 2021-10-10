package co.skr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Question1 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Long, Contact> contactMap = new TreeMap<>();
		
		int option;
		
		loop: do {
			System.out.print("Enter 1 to input values 2 to exit: ");
			option = Integer.parseInt(reader.readLine());
			
			if(option == 2)
				break loop;
			
			System.out.print("Enter Phone Number: ");
			long phoneNumber = Long.parseLong(reader.readLine());
			
			System.out.print("Enter Name: ");
			String name = reader.readLine();
			
			System.out.print("Enter Email: ");
			String email = reader.readLine();
			
			System.out.print("Enter Gender(M/F): ");
			String gender = reader.readLine();
			
			contactMap.put(phoneNumber, new Contact(phoneNumber, name, email, gender));
			
			for(Long p: contactMap.keySet()) {
				System.out.print(p);
				System.out.println(" --> "+contactMap.get(p));
				System.out.println("-----------------------------------------------------------------------------------");
			}
			
		}while(option != 2);	
		
		System.out.print("Program Executed successfully");
	}

}
