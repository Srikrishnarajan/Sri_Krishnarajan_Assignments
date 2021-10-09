//Program to insert string at the specified position using StringBuffer
package co.skr;

public class Question2_2 {

	public static void main(String[] args) {
		StringBuffer strbuf = new StringBuffer("It is used to  at the specified index position");
		System.out.println(strbuf);
		
		strbuf.insert(14, "insert text");
		System.out.println(strbuf);
	}

}
