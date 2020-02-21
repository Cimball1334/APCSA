package Chapter19;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster1
{
	private String name;
	private int howBig;	

	public Monster1()
	{
		
	}

	public Monster1(String n, int size)
	{
		name = n;
		howBig = size;
	}

	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster1 other)
	{
		return false;
	}
	
	public boolean isSmaller(Monster1 other)
	{
		//call isBigger() use !
		return false;
	}

	public boolean namesTheSame(Monster1 other)
	{
		return false;
	}
	
	public String toString()
	{
		return "";
	}
}