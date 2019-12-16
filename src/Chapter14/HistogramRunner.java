package Chapter14;

public class HistogramRunner {
	public static void main(String[] args) {
		int[] one = { 1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3 };
		int[] two = { 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5 };
		int[] three = { 2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5 };
		Histogram John = new Histogram(one);
		System.out.println(John);
		John.setVars(two);
		System.out.println(John);
		John.setVars(three);
		System.out.println(John);
	}
}