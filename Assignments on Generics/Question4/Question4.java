//Program to define two objects for Pair Class for different scenarios as per the problem statement
package co.skr;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Pair<String, String> strPair = new Pair<>();
        strPair = new Pair<>("Siva","28000");
        
        System.out.println("Key: "+strPair.getKey()+" Value: "+strPair.getValue());
        
        System.out.println("--------------------------------------------------------------");
        
        Pair<String, Date> strDatePair = new Pair<>();
        SimpleDateFormat dateValue = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        
        try{
        	System.out.print("Enter date in yyyy-mm-dd format for strDatePair: ");
        	String strDate = sc.nextLine();
        	
        	Date date = dateValue.parse(strDate);
        	strDatePair = new Pair<>("Siva", date);
        	
        	System.out.println("--------------------------------------------------------------");
        	System.out.println("Key: "+strDatePair.getKey()+" Value: "+strDatePair.getValue());
        }catch (Exception e){
           System.out.println("Parse Exception");
        }finally {
			sc.close();
		}
	}

}
