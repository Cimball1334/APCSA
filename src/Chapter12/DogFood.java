package Chapter12;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import java.lang.Math;

public class DogFood {
	private double amount;

	public DogFood() {
	}

	public DogFood(String line) {
		Scanner chopper = new Scanner(line);
		double cups = 0;
		while (chopper.hasNextInt()) {

			// calc code goes here

			int weight = chopper.nextInt();

			int caseNum = 0;

			if (weight < 2)
				caseNum = 0;
			if (weight >= 2 && weight < 4)
				caseNum = 1;
			if (weight >= 5 && weight < 7)
				caseNum = 2;
			if (weight >= 8 && weight < 9)
				caseNum = 3;
			if (weight >= 10 && weight < 19)
				caseNum = 4;
			if (weight >= 20 && weight < 39)
				caseNum = 5;
			if (weight >= 40 && weight < 59)
				caseNum = 6;
			if (weight >= 60 && weight < 79)
				caseNum = 7;
			if (weight >= 80)
				caseNum = 8;

			switch (caseNum) {

			case 0:

			case 1:
				cups += 0.5 * 7;
				break;
			case 2:
				cups += 1.0 * 7;
				break;
			case 3:
				cups += 1.5 * 7;
				break;
			case 4:
				cups += 2.0 * 7;
				break;
			case 5:
				cups += 3.5 * 7;
				break;
			case 6:
				cups += 4.5 * 7;
				break;
			case 7:
				cups += 6 * 7;
				break;
			case 8:
				cups += 7.5 * 7;
				break;

			}

			amount = (int) (cups / 60);
			if (cups % 60 > 0) {
				amount++;
			}
		}
	}

	public double getAmount() {
		return amount;
	}

	public String toString() {
		return getAmount() + " - 10 Pound Bags";
	}
}