package co.skr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Question3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		TreeSet<Employee> employeeSet = new TreeSet<>();
		
		employeeSet.add(new Employee(6, "Harbhajan", "Dept6", 600000));
		employeeSet.add(new Employee(9, "Yuvraj", "Dept9", 900000));
		employeeSet.add(new Employee(3, "Laxman", "Dept3", 300000));
		employeeSet.add(new Employee(8, "Dravid", "Dept8", 800000));
		employeeSet.add(new Employee(4, "Sehwag", "Dept4", 400000));
		employeeSet.add(new Employee(2, "Zaheer", "Dept2", 200000));
		employeeSet.add(new Employee(7, "Dhoni", "Dept7", 700000));
		employeeSet.add(new Employee(1, "Ganguly", "Dept1", 100000));
		employeeSet.add(new Employee(5, "Gambhir", "Dept5", 500000));
		employeeSet.add(new Employee(10, "Sachin", "Dept10", 1000000));
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(14, "Kumble", "Dept14", 140000));
		list.add(new Employee(12, "Kapil Dev", "Dept12", 120000));
		list.add(new Employee(13, "Srikanth", "Dept13", 130000));
		list.add(new Employee(11, "Ishant", "Dept11", 110000));
		
		for(Employee e: list) {
			employeeSet.add(e);
		}
		
		String option;
		
		loop: do {
			System.out.print("Enter x to input data, y to view data and z to exit: ");
			option = reader.readLine();
			
			if(option.equals("z"))
				break loop;
			
			switch(option) {
			case "x": 
				break;
			case "y": 
				for(Employee e: employeeSet) {
					System.out.println(e);
				}
				break;	
			default:
				System.out.println("Invalid option. Please enter a valid option!");
			}
		}while(option != "z");
		
		System.out.println("Program Executed successfully");
	}

}
