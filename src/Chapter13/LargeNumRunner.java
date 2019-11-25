package Chapter13;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class LargeNumRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("largenum.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
		}
	}
}