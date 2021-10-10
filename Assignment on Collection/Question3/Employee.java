package co.skr;

public class Employee implements Comparable<Employee>{
	
	private int ID;
	private String Name;
	private String Department;
	private int Salary;

	public Employee() {}
	
	public Employee(int id, String name, String department, int salary) {
		ID = id;
		this.Name = name;
		this.Department = department;
		this.Salary = salary;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getDepartment() {
		return Department;
	}

	public int getSalary() {
		return Salary;
	}

	@Override public int compareTo(Employee e) {
		return this.getID() - e.getID() ;
	}

	@Override public String toString() {
		return "Employee [ID = "+ID+", Name = "+Name+", Department = "+Department+", Salary = " +Salary+"]";
	}
}
