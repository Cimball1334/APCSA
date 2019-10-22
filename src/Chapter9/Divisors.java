package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Divisors
{
	public static String getDivisors( int number )
	{
		String divisors="";
		int i = 1;
		while(i <= number / 2)
		{
		 
		    if(number % i == 0)
		    {
		       divisors += " " + i; 
		      }
		      i++;
		  }
		return divisors; 
	}
}