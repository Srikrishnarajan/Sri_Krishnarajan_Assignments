//Same program as Question2_3 but here we need to use StringBuilder
package co.skr;

public class Question3_3 {

	public static void main(String[] args) {
		StringBuilder strbuf = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(strbuf);
		
		strbuf.reverse();
		System.out.println(strbuf);
	}

}
