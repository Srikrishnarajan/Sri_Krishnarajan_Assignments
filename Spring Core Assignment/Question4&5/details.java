package question4and5;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
public class details {
	private Admission aDetails;
	private student studentDetails;
	private mentor mentorDetails;
	public details() {
		
	}
	public details(Admission aDetails, student studentDetails, mentor mentorDetails) {
		super();
		this.aDetails = aDetails;
		this.studentDetails = studentDetails;
		this.mentorDetails = mentorDetails;
	}
	public Admission getaDetails() {
		return aDetails;
	}
	@Autowired
	public void setaDetails(Admission aDetails) {
		this.aDetails = aDetails;
	}
	public student getStudentDetails() {
		return studentDetails;
	}
	@Autowired
	public void setStudentDetails(student studentDetails) {
		this.studentDetails = studentDetails;
	}
	public mentor getMentorDetails() {
		return mentorDetails;
	}
	@Resource
	public void setMentorDetails(mentor mentorDetails) {
		this.mentorDetails = mentorDetails;
	}
	@Override
	public String toString() {
		return "Details [aDetails=" + aDetails + ", studentDetails=" + studentDetails + ", mentorDetails="
				+ mentorDetails + "]";
	}
	
}
