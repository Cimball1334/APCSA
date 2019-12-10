package Chapter14;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class OddsAndEvens {
	private static int countEm(int[] array, boolean odd) {
		int count = 0;
		if (odd) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 1) {
					count++;
				}
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static int[] getAllEvens(int[] array) {
		int[] even = new int[countEm(array, false)];
		int place = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even[place] = array[i];
				place++;
			}
		}

		return even;
	}

	public static int[] getAllOdds(int[] array) {

		int[] odd = new int[countEm(array, true)];
		int place = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				odd[place] = array[i];
				place++;
			}
		}
		return odd;
	}
}