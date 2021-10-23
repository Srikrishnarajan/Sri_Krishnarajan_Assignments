package springa1q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "customer.xml" );
		Customer c=(Customer)ctx.getBean("Customer");
		c.CustomerInfo();
	}
}

