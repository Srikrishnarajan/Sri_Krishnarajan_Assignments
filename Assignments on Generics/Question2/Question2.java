//Program to hold and print 10 random Integer Keys and Double Values using HashMap
package co.skr;

import java.util.HashMap;
import java.util.Random;

public class Question2 {

	public static void main(String[] args) {
		HashMap<Integer, Double> randomKeysValues = new HashMap<>();
		Random number = new Random();
		
		//Generates Random Integer and Double type values and adding the same in HashMap using For Loop
		for(int i = 0; i < 10; i++) {
			int randIntKey = 1 + number.nextInt(100);
			double randDoubleValue = 1 + number.nextDouble();
			
			randomKeysValues.put(randIntKey, randDoubleValue);
		}
		
		//Directly accessing for-each loop on HashMap using Lambda Expression to print values
		randomKeysValues.forEach((key, value)->{
            System.out.format("Key: %s, Value: %,.2f%n", key, value);
		});
	}

}
