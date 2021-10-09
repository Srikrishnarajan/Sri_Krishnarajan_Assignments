//Hierarchy of an Organisation program
package co.skr;

import java.util.ArrayList;

class Employee {
    public int getSalary(int salary) {
		return salary;
	}
    
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries) {
    	int totalSalary = 0;
        for(int i = 0; i < employeeSalaries.size(); i++)
               totalSalary += employeeSalaries.get(i);
        return totalSalary;
    }
}

class Manager extends Employee {
    @Override public int getSalary(int salary) {
        int incentive = 5172;
        return salary + incentive;
    }
}

class Labour extends Employee {
    @Override public int getSalary(int salary) {
        int overtimePay = 517;
        return salary + overtimePay;
    }
}

public class Question2 {

	public static void main(String[] args) {
		int salary = 19828;
		
		Manager m = new Manager();
    	int msalary = m.getSalary(salary);
    	
    	Labour l = new Labour();
    	int lsalary = l.getSalary(salary);
    	
    	ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
    	employeeSalaries.add(msalary);
    	employeeSalaries.add(lsalary);
    	
    	Employee e = new Employee();
    	System.out.println("Total Salary of all the Employees is "+e.totalEmployeesSalary(employeeSalaries));
	}

}
