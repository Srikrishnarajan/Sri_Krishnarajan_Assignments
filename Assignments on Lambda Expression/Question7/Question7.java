package co.skr;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Question7 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Milk");
		map.put(2, "Butter");
		map.put(3, "Paneer");
		map.put(4, "Ghee");
		map.put(5, "Curd");
		
		printList(map, System.out::println);
	}
	
	private static void printList(Map<Integer, String> map, Consumer<String> consumer) {
		StringBuilder buffer= new StringBuilder("");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			buffer.append("Key: "+entry.getKey()+", Value: "+entry.getValue()+"\n");			
		}
		consumer.accept(buffer.toString());
	}

}
