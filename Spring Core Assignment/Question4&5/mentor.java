package question4and5;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;


@Controller
public class mentor {
	private int id;
	private String name;
	private student studentDetails;
	public mentor() {
		
	}
	
	public mentor(int id, String name, student studentDetails) {
		super();
		this.id = id;
		this.name = name;
		this.studentDetails = studentDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public student getStudentDetails() {
		return studentDetails;
	}
	
	@SuppressWarnings("deprecation")
	@Required
	public void setStudentDetails(student studentDetails) {
		this.studentDetails = studentDetails;
	}
	@Override
	public String toString() {
		return "Mentor [id=" + id + ", name=" + name + ", \nstudentDetails=" + studentDetails + "]";
	}
	

}
