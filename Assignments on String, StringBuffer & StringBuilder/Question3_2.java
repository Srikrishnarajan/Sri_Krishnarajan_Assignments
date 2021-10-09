//Same program as Question2_2 but here we need to use StringBuilder
package co.skr;

public class Question3_2 {

	public static void main(String[] args) {
		StringBuilder strbuf = new StringBuilder("It is used to  at the specified index position");
		System.out.println(strbuf);
		
		strbuf.insert(14, "insert text");
		System.out.println(strbuf);
	}

}
