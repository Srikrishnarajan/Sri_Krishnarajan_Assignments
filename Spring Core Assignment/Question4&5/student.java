package question4and5;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
@Service
public class student {
	private String name;
	private int age;
	private double CGPA;
	private Admission aDetails;
	public student() {
		
	}
	public student(String name, int age, double cGPA, Admission aDetails) {
		super();
		this.name = name;
		this.age = age;
		CGPA = cGPA;
		this.aDetails = aDetails;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCGPA() {
		return CGPA;
	}
	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
	public Admission getaDetails() {
		return aDetails;
	}
	@Inject
	public void setaDetails(Admission aDetails) {
		this.aDetails = aDetails;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", CGPA=" + CGPA + ", \naDetails=" + aDetails + "]";
	}

}
