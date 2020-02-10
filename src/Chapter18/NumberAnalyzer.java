package Chapter18;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private Number[] list;

	public NumberAnalyzer()
	{

	}

	public NumberAnalyzer(String numbers)
	{
		String[] nums = numbers.split(" ");
		setList(nums);
		list = new Number[nums.length];
	}
	
	
	
	public void setList(String[] numbers)
	{
		String[] nums = numbers;
		for(String s : nums) {
			
			
			Number n = new Number(3);
			

			
		}
		
	
	}

	public int countOdds()
	{
      int oddCount=0;



      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;



      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;



      return perfectCount;
	}
	
	public String toString( )
	{
		return "" + list.toString();
	}
}