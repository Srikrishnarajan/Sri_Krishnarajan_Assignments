package co.skr;

import java.util.ArrayList;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Siva");
		list.add("Surya");
		list.add("Santhanam");
		list.add("Aadhitya");
		list.add("Srinivasan");
		list.add("Santhosh");
		
		list.removeIf(word -> word.length()%2 != 0);
		
		for (String str : list) {
			System.out.println(str);
		}
	}

}
