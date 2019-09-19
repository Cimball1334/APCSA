package Chapter6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringFirstLetterCheck test = new StringFirstLetterCheck();
		
		test.setWords("hello", "howdy");
		out.println(test);
		
		test.setWords("one", "two");
		out.println(test);

	}
}