//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class ReverseNumber
{
   private int number;

	//add constructors
	public ReverseNumber()
	{
	    setNumber(0);
	   }
	   
	public ReverseNumber(int num)
	{
	    setNumber(num);
	   }
	
	
	//add a set method
	public void setNumber(int num)
	{
	    number = num;
	   }


	public int getReverse()
	{
		int rev=0;	
		
		while(number != 0)
		{
		   
		   rev = (rev * 10) + (number % 10);
		   number = number / 10;
		  }
		
		return rev;
	}

	//add  a toString
	public String toString()
	{
	    String output = number + " reversed is " + getReverse() + "\n";
	    
	    return output;
	   }
	
}