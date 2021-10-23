package question4and5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app{
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/*
		 * System.out.println("Mentor Details"); Mentor mentor =
		 * (Mentor)context.getBean("mentor"); System.out.println(mentor);
		 */
    	System.out.println("All Details from details class");
    	details details = (details)context.getBean("details");
    	System.out.println(details);
    }
}
