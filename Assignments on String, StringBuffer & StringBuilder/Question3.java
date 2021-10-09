//Program to perform some string operations using string methods
package co.skr;

public class Question3 {

	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		for(int i = 0; i < str.length(); i++) {
		       if(str.charAt(i)=='a') {
		           str = str.substring(0, i) + '$' + str.substring(i+ 1);
		       }
		}
		System.out.println(str);
		
	    String str1 = "";
		int j = 0;
		String[] str2 = new String[14];
		
	    for(int i = 0; i <= str.length(); i++) {
		    if(i == str.length()) {
		        str2[j] = str1;
		        str1 = "";
		        j++;
		    }
		    
		    else if(str.charAt(i) != ' ') {
		        str1 = str1 + Character.toString(str.charAt(i));
		    }
		    
		    else if(str.charAt(i) == ' ') {
		        str2[j] = str1;
		        str1 = "";
		        j++;
		    }
	    }
	    
		for(int i = 0; i < str2.length; i++) {
		    if(str2[i].equals("collection")) {
		        System.out.println("Yes");
		    }
		}
	}

}
