package Chapter13;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class BoxRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner( new File("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\Chapter13\\box.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i <size; i++) {
			String line = file.nextLine();
			
			Box test = new Box();
			test.setBox(line);
			System.out.println(test);
			
		}
		
	}
}