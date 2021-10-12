package co.skr;

@interface Test{}

class TestCase{
	@Test public void runTestCase(){
        System.out.println("Test Case passed successfully");
    }
}

public class Question1 {

	public static void main(String[] args) {
		TestCase test = new TestCase();
		test.runTestCase();
	}

}
