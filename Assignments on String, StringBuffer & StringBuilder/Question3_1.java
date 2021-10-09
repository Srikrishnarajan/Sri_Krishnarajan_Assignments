//Same program as Question2_1 but here we need to use StringBuilder
package co.skr;

public class Question3_1 {

	public static void main(String[] args) {
		String str1 = "is a peer class of String ";
		String str2 = "that provides much of ";
		String str3 = "the functionality of strings";
		
		StringBuilder strbuild = new StringBuilder("StringBuffer ");
		strbuild.append(str1);
		strbuild.append(str2);
		strbuild.append(str3);
		
		System.out.println(strbuild);
	}

}
