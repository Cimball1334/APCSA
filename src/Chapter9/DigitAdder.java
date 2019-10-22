package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DigitAdder
{
   public static int sumDigits( int number )
	{
		int sum = 0;
		
		while(number > 0)
		{
		    
		    sum += number % 10;
		    number = number / 10;
		    
		    
		  }
		return sum; 
	}
}