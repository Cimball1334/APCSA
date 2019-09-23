package Chapter7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner; 

public class MorseCodeRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		Scanner input = new Scanner(System.in);
		
		MorseCode test = new MorseCode();
		
		test.setChar('A');
		out.println(test);
		
		test.setChar('B');
		out.println(test);
		
		test.setChar('3');
		out.println(test);
		
		test.setChar('Z');
		out.println(test);
		
		test.setChar('8');
		out.println(test);
		
		test.setChar('F');
		out.println(test);
		
		test.setChar('0');
		out.println(test);
		
		
		
	}
}