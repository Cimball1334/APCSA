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
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{

	}

	public NumberAnalyzer(String numbers)
	{
		String[] nums = numbers.split(" ");
		setList(nums);
			
	}
	
	
	
	public void setList(String[] numbers)
	{
		String[] nums = numbers;
		for(String s : nums) {
			
			Number n = new Number(Integer.parseInt(s));
			
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