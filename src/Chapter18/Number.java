package Chapter18;

///� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Number
{
	private Integer number;

	public Number()
	{
	}

	public Number(int num)
	{
		setNumber(num);
	}

	public void setNumber(int num)
	{
		number = num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		if(number % 2 == 1)
			return true;
		return false;
	}

	public boolean isPerfect()
	{
		int total=0;
		for(int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
                total = total + i;
            }
        }
		
		return (number==total);
	}
	
	public String toString( )
	{
		return "";
	}
}