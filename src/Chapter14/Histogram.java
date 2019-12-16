package Chapter14;

public class Histogram {
	private int[] array;

	public Histogram() {
		setVars(new int[99]);
	}

	public Histogram(int[] newArray) {
		setVars(newArray);
	}

	public void setVars(int[] newArray) {
		array = newArray;
	}

	public String toString() {
		int[] holder = new int[10];
		int counter = 0;
		String output = "";
		for (int num : array) {
			holder[num]++;
		}
		for (int holdees : holder) {
			output += counter + " - " + holdees + "\n";
			counter++;
		}
		return output;
	}
}