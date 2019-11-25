package Chapter13;

import java.util.Scanner;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Social {
	private String socialNum;

	public Social() {
	}

	public Social(String soc) {
		setSocial(soc);
	}

	public void setSocial(String soc) {
		socialNum = soc;
	}

	@SuppressWarnings("resource")
	public int getSum() {
		@SuppressWarnings("unused")
		Scanner chopper = new Scanner(socialNum);
		chopper.useDelimiter("\\-");
		int sum = 0;
		while (chopper.hasNextInt()) {

			int num = chopper.nextInt();
			sum+= num;
			
		}

		return sum;
	}

	public String toString() {
		return "SSN " + socialNum + " has a sum of "+ getSum();
	}
}