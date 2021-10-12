package co.skr;

import java.util.ArrayList;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Italy");
		list.add("Newzealand");
		list.add("Denmark");
		list.add("Ireland");
		list.add("Australia");
		
		list.replaceAll(word -> word.toUpperCase());
		
		for (String str : list) {
			System.out.println(str);
		}
	}

}
