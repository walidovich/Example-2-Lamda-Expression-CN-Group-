package dk.cngroup.training.java8.lambdas;

public class Main {

	public static void main(String[] args) {
		//Solution 1.5
		System.out.println("Using instances of each specialist surgeon:");
		GeneralSurgeon generalSurgeon = new GeneralSurgeon();

		generalSurgeon.performOperation(new BrainTransplant());
		generalSurgeon.performOperation(new HumorInjection());
		System.out.println("*****************************************************");

		System.out.println("Using instance of an anonymous specialist surgeon:");
		// Passing anonymous class
		generalSurgeon.performOperation(new Operation() {
			@Override
			public void operate() {
				System.out.println("You want bigger lips? bring me olive oil...");
			}
		});
		System.out.println("*****************************************************");

		System.out.println("Using lambda expression without the need of an instance of any surgeon");
		// Solution 2: Java 8 style
		generalSurgeon.performOperation(() -> System.out.println("Too much pivo? let's get you a pivo detox."));

		// Java SE7 and prior:
		Integer a = new Integer(10);
		String s = String.valueOf(a);

		// Purpose of Java SE8 with lambdas can be described this way:
//		f = public void operate () {
//			System.out.println("You want bigger lips? bring me olive oil...");
//		}
//		generalSurgeon.performOperation(f);

//		function2 = public int getSum ( int a, int b){
//			return a + b;
//		}
//		generalSurgeon.performOperation((int a, int b) -> a + b);
//		void functionName (void) {// Operation details}
	}
}