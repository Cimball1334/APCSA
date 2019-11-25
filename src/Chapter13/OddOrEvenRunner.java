package Chapter13;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class OddOrEvenRunner
{
	public static void main( String args[] ) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner file = new Scanner(new File("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\Chapter13\\oddoreven.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
		   int num = file.nextInt();
			
		   OddOrEven test = new OddOrEven();
		   test.setNum(num);
		   System.out.println(test);
		}
	}
}