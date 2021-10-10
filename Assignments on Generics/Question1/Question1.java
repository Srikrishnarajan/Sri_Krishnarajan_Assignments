//Program to hold Employee Objects using HashSet. Employee Class is defined in Employee.java
package co.skr;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		Set<Employee> employee = new HashSet<>(); 
		
		employee.add(new Employee(1, "Siva", 28000));
		employee.add(new Employee(2, "Surya", 33000));
		employee.add(new Employee(3, "Guna", 27000));
		employee.add(new Employee(4, "Srinivasan", 23000));
		employee.add(new Employee(5, "Santhanam", 22000));
		employee.add(new Employee(3, "Adhirath", 37500));
		employee.add(new Employee(3, "Santhanam", 25000));
		
		System.out.println("Total number of Employees: "+employee.size()+"\n");
		
		for(Employee e: employee) {
			System.out.println(e);
		}
	}

}
