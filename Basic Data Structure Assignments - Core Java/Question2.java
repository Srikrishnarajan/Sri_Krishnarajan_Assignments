//Armstrong numbers falling in the range of 100-999 program
package co.skr;

public class Question2 {

	public static boolean isArmstrong(int value) {
		int actualNumber = 0, remainder, sum = 0;
		actualNumber = value;
		
		while(value > 0) {
			remainder = value % 10;
			sum += (remainder * remainder * remainder);
			value /= 10;
		}
		
		return sum == actualNumber;
	}
	
	public static void main(String[] args) {
		int minLimit = 100, maxLimit = 999;
		System.out.println("Armstrong numbers falling in the range of "+minLimit+"-"+maxLimit+" are:");
		
		for(int i = minLimit; i <= maxLimit; i++) {
			if(isArmstrong(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

}
