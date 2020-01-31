package Chapter17;//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String choice = "";

		do {
			System.out.println("Enter the letter for the box :: ");
			char letter = input.next().charAt(0);
			System.out.println("Enter the size of the box :: ");
			int size = input.nextInt();
			LetterBoxes.printBox(letter, size);
			System.out.println();
			System.out.println("Do you want to enter more sample input? ");
			choice = input.next();

		} while (choice.equals("Y") || choice.equals("y"));
	}
}