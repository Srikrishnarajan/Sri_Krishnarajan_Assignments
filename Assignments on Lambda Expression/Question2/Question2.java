package co.skr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Question2 {

	public static void main(String[] args) {
		List<Orders> list = new ArrayList<>();
		
		list.add(new Orders(10001, "Accepted"));
		list.add(new Orders(10500, "Completed"));
		list.add(new Orders(11000, "Failed"));
		list.add(new Orders(11500, "Failed"));
		list.add(new Orders(12000, "Completed"));
		list.add(new Orders(12500, "Accepted"));
		
		//Covered Question3 - Consumer & Predicate
		printOrders(list, o -> (o.getOrderStatus().equalsIgnoreCase("accepted") 
				|| o.getOrderStatus().equalsIgnoreCase("completed")) 
				&&o.getOrderPrice() > 10000, System.out::println);
	}
	
	private static void printOrders(List<Orders> list, Predicate<Orders> condition, Consumer<Orders> consumer) {

		for (Orders orders : list) {
			if(condition.test(orders))
				consumer.accept(orders);
		}
		
	}

}
