package Chapter14;


public class FibonacciRunner {
	public static void main(String[] args) {
		Fibonacci tester = new Fibonacci(50);
		System.out.println(tester.getValueAtIndex(1));
		System.out.println(tester.getValueAtIndex(2));
		System.out.println(tester.getValueAtIndex(3));
		System.out.println(tester.getValueAtIndex(4));
		System.out.println(tester.getValueAtIndex(5));
		System.out.println(tester.getValueAtIndex(6));
		System.out.println(tester.getValueAtIndex(11));
		System.out.println(tester.getValueAtIndex(16));
		System.out.println(tester.getValueAtIndex(21));
		System.out.println(tester.getValueAtIndex(31));
		System.out.println(tester.getValueAtIndex(41));
		System.out.println(tester.getValueAtIndex(46));
		tester.setVars(1);
		System.out.println(tester.getValueAtIndex(1));
		tester.setVars(2);
		System.out.println(tester.getValueAtIndex(1));
		System.out.println(tester.getValueAtIndex(2));
		System.out.println(tester.getValueAtIndex(11));
	}
}