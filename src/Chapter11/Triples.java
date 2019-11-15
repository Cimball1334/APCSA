package Chapter11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
setNum(num);

	}

	public void setNum(int num)
	{
number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int largerNum = 0;
		if(a>= b && a >=c) largerNum = a;
		if(b>= a && b >= c) largerNum = b;
		else largerNum = c;

		for(int i = 1; i <=largerNum; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				max = i;
			}
		}
		
		return max;
	}

	public String toString()
	{
		 String output="";

	        for(int a = 1; a <=number; a++)
	        {

	            for(int b = 1; b <= number; b++)
	            {

	                for(int c = 1; c <= number; c++)
	                {
	                    if((a * a) + (b * b) == (c * c))
	                    {
	                        if((a % 2 == 1 && b % 2 == 0 && c % 2 == 1) || (a % 2 == 0 && b % 2 == 1 && c % 2 == 1))
	                        {
	                            if(greatestCommonFactor(a,b,c) == 1)
	                            {
	                                output += a + " " + b + " " + c + "\n";
	                            }
	                        }
	                    }

	                }

	            }

	        }



	        return output+"\n";
	}
}