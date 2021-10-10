package co.skr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Question4 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<LocalDate> list = new LinkedList<>();
		
		list.add(LocalDate.of(2002, 8, 10));
		list.add(LocalDate.of(1999, 8, 30));
		list.add(LocalDate.of(1996, 11, 14));
		
		int option;
		System.out.print("Enter 1 to continue the process 2 to exit: ");
		option = Integer.parseInt(reader.readLine());
		
		while (option != 2){
			try {	
				System.out.print("Enter 1 to add date 2 to view date: ");
				int option1 = Integer.parseInt(reader.readLine()); 
				
				switch (option1) {
					case 1: 
						System.out.print("Enter Date in DD-MM-YYYY format: ");
						String date = reader.readLine();
						
						DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
						LocalDate parsedDate = LocalDate.parse(date, dateFormat);
						
						System.out.println("Date added: "+parsedDate);
						list.add(parsedDate);
						break;
					case 2:
						System.out.println("Your Date of Birth is "+list.get(2)+" and it "+CheckLeapYear(list.get(2)));
						break;
					default:
						System.out.println("Invalid option");
				}
							
				System.out.print("Enter 1 to continue the process 2 to exit: ");
				option = Integer.parseInt(reader.readLine());
			} catch (Exception e) {
				System.out.println("Error: "+e.getMessage());
			} 
		}
	}

	private static String CheckLeapYear(LocalDate localDate) {
		if(((localDate.getYear()%4 == 0) && (localDate.getYear()%100 != 0)) || (localDate.getYear()%400 == 0))
			return "was a leap year";
		return "wasn't a leap year";
	}
	
}

