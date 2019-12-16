package Chapter14;

import java.util.Arrays;

public class ArrayStats {
	private int[] listOfNumbers;

	public ArrayStats() {
		setVars(null);
	}

	public ArrayStats(int[] array) {
		setVars(array);
	}

	public void setVars(int[] array) {
		listOfNumbers = array;
	}

	public int getNumGroupsOfSize(int size) {
		int count = 1;
		int amount = 0;
		int previous = 0;
		for (int num : listOfNumbers) {
			if (num == previous) {
				count++;
			} else {
				count = 1;
			}
			if (count == size) {
				amount++;
			}
			previous = num;
		}
		return amount;
	}

	public String toString() {
		return Arrays.toString(listOfNumbers);
	}
}