//Singleton Class program
package co.skr;

class Singleton {
	private static Singleton single_instance = null;
	
	public static Singleton getInstance() {
		if (single_instance == null) {
			single_instance = new Singleton();
		}
		
		return single_instance;
	}
}

public class Question1 {

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		
		System.out.println("Hashcode of a is "+ a.hashCode());
		System.out.println("Hashcode of b is "+ b.hashCode());
		System.out.println("Hashcode of c is "+ c.hashCode());
		
		if (a == b && b == c) {
			System.out.println("Three objects point to the same memory location i.e., to the same object");
		}

		else {
			System.out.println("Three objects do not point to the same memory location ");
		}
	}

}
