package co.skr;

interface Lambda {
	public void basicArithmeticOperations();
}

public class Question1 {

	public static void main(String[] args) {
		int x = 76, y = 45;
		
		Lambda addOperation = () ->{
			int sum = x + y;
			System.out.println("Addition of 2 numbers is "+sum);
			System.out.println("------------------------------------------------------");
		};
		
		Lambda subtractOperation = () ->{
			int subtract = x - y;
			System.out.println("Subtraction of 2 numbers is "+subtract);
			System.out.println("------------------------------------------------------");
		};
		
		Lambda multiplyOperation = () ->{
			int product = x * y;
			System.out.println("Multiplication of 2 numbers is "+product);
			System.out.println("------------------------------------------------------");
		};
		
		Lambda divideOperation = () ->{
			int quotient = x / y;
			System.out.println("Division of 2 numbers results "+quotient+" as quotient");
		};

		System.out.println("Calling Lambda Expressions...");
		System.out.println("------------------------------------------------------");
		addOperation.basicArithmeticOperations();
		subtractOperation.basicArithmeticOperations();
		multiplyOperation.basicArithmeticOperations();
		divideOperation.basicArithmeticOperations();
	}

}
