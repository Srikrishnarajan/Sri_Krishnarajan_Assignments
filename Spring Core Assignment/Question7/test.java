package question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main( String[] args ){
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "spring.xml" );
		number n1=(number)ctx.getBean("number");
		System.out.println(n1);
	}
}
