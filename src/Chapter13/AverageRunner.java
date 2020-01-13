package Chapter13;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class AverageRunner
{
	public static void main( String args[] ) throws IOException
	{
	    Scanner file = new Scanner(new File("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\Chapter13\\average.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
		    String s = file.nextLine();
		    
		    Average test = new Average();
		    test.setLine(s);
		    System.out.println(test);
		}
	}
}