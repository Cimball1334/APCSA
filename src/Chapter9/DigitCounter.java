package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DigitCounter
{
   public static int countDigits( int number )
	{
		int sum = 0;
		
		while(number > 0)
		{
		    sum++;
		    number = number / 10;
		    
		    
		  }
		return sum; 
	}
}