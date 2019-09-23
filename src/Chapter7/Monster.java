package Chapter7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Monster
{
	private String name;
	private int howBig;	

	public Monster()
	{


	}

	public Monster(String n, int size)
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
	
	public boolean isBigger(Monster other)
	{
		if (getHowBig() > other.getHowBig() )
			return true;
		return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		//call isBigger() use !
		if(!isBigger(other)) 
			return true;
		return false;
	}

	public boolean namesTheSame(Monster other)
	{
		if(getName().equals(other.getName()))
			return true;
		return false;
	}
	
	public String toString()
	{
		return "monster --" + getName() + " "  + getHowBig();
	}
}