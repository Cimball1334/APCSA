//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class GCD
{
	private int one, two;

	public GCD()
	{
	    setNums(0,0);
	}

	public GCD(int numOne, int numTwo)
	{
	    setNums(numOne,numTwo);
	}

	public void setNums(int numOne, int numTwo)
	{
	    one = numOne;
	    two = numTwo;
	}

	public long getGCD( )
	{
		long gcd=0;
		int largerNum;
		if(one >=two) largerNum = one;
		else largerNum = two;
		for(int i = 1; i <= largerNum; i++)
		{
		   if(one % i == 0 && two % i == 0)
		   {
		       gcd = i;
		      }
		  }
		
		return gcd;
	}

	public String toString()
	{
		return "The gcd of "+ one + " and " + two + " is  "  + getGCD();
	}
}