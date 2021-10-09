//Program to reverse the string using StringBuffer
package co.skr;

public class Question2_3 {

	public static void main(String[] args) {
		StringBuffer strbuf = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(strbuf);
		
		strbuf.reverse();
		System.out.println(strbuf);
	}

}
