//Program to handle checked exception carried forward with the Question1
package co.skr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Dividend: ");
		int dividend = Integer.parseInt(reader.readLine());
		System.out.print("Enter Divisor: ");
		int divisor = Integer.parseInt(reader.readLine());	
		
		int quotient;
	
		try {
			if(divisor == 0)
				throw new UnsupportedOperationException("/ by 0 is not allowed");
			
			quotient = (dividend / divisor);
			System.out.println("The resulting quotient for this arithmetic operation is "+quotient);	
		}catch (UnsupportedOperationException e) {
			System.out.println("Error: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("A runtime exception was caught at: "+e.getMessage());
		}
	}

}
