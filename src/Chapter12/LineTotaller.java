//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{	
	    setLine(s);
	}

	public void setLine(String s)
	{
	    line = s;
	}

	public int getSum()
	{
		int total = 0;
		Scanner chopper = new Scanner(line);
		
		while(chopper.hasNextInt())
		{
		    total += chopper.nextInt();
		    
		  }
		
		return total;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		String output = getLine();
		return output += "\nsum = " + getSum() + "\n";
	}
}