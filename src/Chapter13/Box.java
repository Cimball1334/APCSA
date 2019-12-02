package Chapter13;

import java.util.Scanner;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab -

public class Box {
	private String let;
	private int size;

	// make two constructors
	public Box() {

	}

	public Box(int s) {

	}

	public void setBox(String letter) {
		let = letter;
	}

	public String toString() {
		String output = "";

		Scanner chopper = new Scanner(let);
		let = chopper.next();
		size = chopper.nextInt();

		for (int i = 0; i < size; i++) {

			for (int a = 0; a < size; a++) {
				output += let;
			}
			output += "\n";
		}

		return output;
	}
}