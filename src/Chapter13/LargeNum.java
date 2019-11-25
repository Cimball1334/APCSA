package Chapter13;

import java.util.Scanner;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class LargeNum
{
   private String line;

   public LargeNum()
   {
   }

   public LargeNum(String s)
   {
	   line = s;
   }
   
   public void setLine(String s) {
	   line = s;
   }

	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
		
		@SuppressWarnings("resource")
		Scanner chopper = new Scanner(line);
		while(chopper.hasNextInt()) {
			int num = chopper.nextInt();
			if(num> largest) {
				largest = num;
			}
		}

		return largest;
	}

	public String toString( )
	{
		return line + " - Largest == " + getLargest();
	}
}