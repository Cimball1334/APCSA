package Chapter11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle( String let, int size)
	{
		String output="";
		
		for(int a = 0; a <size; a++ ) {
			
			for(int b = 0; b <= a; b++) {
				//System.out.print(let);
				output += let;
			}
			//System.out.println();
				output+= "\n";
		}
		
		return output;
	}
}