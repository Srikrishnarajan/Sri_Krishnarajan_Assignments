package com.naveen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.naveen.Employee;
public class Employeeservice {
	private static Map<Long,Employee> employees=Database.getEmployees();
    public Employeeservice() {
    	employees.put(1L, new Employee(1,"AK","IT","HEAD",50000));
    	employees.put(2L, new Employee(5,"AP","BUSINESS","HEAD",45000));
    	
    }
    public List<Employee> getAllEmployees(){
    	return new ArrayList<Employee>(employees.values());
    }
    public Employee getEmployee(Long id) {
		return employees.get(id);
    	
    }
    
	
	public Employee addEmployee(Employee employee) {
		employee.setId(employees.size()+1);
		employees.put(employee.getId(),employee);
		return employee;
	}
	public Employee updateEmployee(Employee employee) {
		if(employee.getId()<=0)
		{
			return null;
		}
		employees.put(employee.getId(),employee);
		return employee;
	}
	
	public Employee deleteEmployee(Long id) {
		return employees.remove(id);
	}
	
	
	


	
}

