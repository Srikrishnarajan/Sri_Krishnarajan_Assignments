package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "customer.xml" );
		questions c=(questions)ctx.getBean("questions");
		c.displayList();
		c.displaySet();
		c.displayMap();
	}

}

