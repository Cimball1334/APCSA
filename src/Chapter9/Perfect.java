package Chapter9;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Perfect
{
   private int number;

	//add constructors
	public Perfect()
	{
	    setNum(0);
	   }
	
	public Perfect(int num)
	{
	    setNum(num);
	   }

	//add a set method
	public void setNum(int num)
	{
	    number = num;
	   }
	
	

	public boolean isPerfect()
	{
	int i = 1;
	int divisorSum = 0;
	while(i <= number / 2)
	{
	    if(number % i == 0)
	    {    
	        divisorSum = divisorSum + i;
	       }
	       i++;
	   }
	if(number == divisorSum) return true;    
	    
	    return false;
	}

	//add a toString
	public String toString()
	{
	    String output = "help";
	    
	    if(isPerfect()) output = number + " is perfect.\n";
	    else output = number + " is not perfect.\n";
	    return output;
	   }
	
}