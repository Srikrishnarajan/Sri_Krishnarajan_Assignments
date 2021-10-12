package co.skr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Italy");
		list.add("Newzealand");
		list.add("Denmark");
		list.add("Ireland");
		list.add("Australia");
		
		printString(list, System.out::println);
	}
	
	private static void printString(List<String> list, Consumer<String> consumer) {
		StringBuilder buffer = new StringBuilder("");
		
		for (String str : list) {
			buffer.append(str.charAt(0));
		}
		
		consumer.accept(buffer.toString().toUpperCase());
	}

}
