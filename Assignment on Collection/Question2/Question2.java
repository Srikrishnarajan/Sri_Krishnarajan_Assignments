package co.skr;

import java.util.Set;
import java.util.TreeSet;

public class Question2 {

	public static void main(String[] args) {
		Set<String> productSet = new TreeSet<>();
		
		System.out.println("Trying to add 10 elements...");
		
		productSet.add("Paneer");
		productSet.add("Mushroom");
		productSet.add("Butter");
		productSet.add("Milk");
		productSet.add("Lemon");
		productSet.add("Ghee");
		productSet.add("Gingely Oil");;
		productSet.add("Rice Bran Oil");
		productSet.add("Walnuts");
		productSet.add("Almonds");
		productSet.add("Almonds");
		
		System.out.println("Size: "+ productSet.size());
		System.out.println(productSet);
	}

}
