//Program to concatenate strings using StringBuffer
package co.skr;

public class Question2_1 {

	public static void main(String[] args) {
		String s1="is a peer class of String ";
		String s2="that provides much of ";
		String s3="the functionality of strings";
		
		StringBuffer strbuf = new StringBuffer("StringBuffer ");
		
		strbuf.append(s1);
		strbuf.append(s2);
		strbuf.append(s3);
		
		System.out.println(strbuf);
	}

}
