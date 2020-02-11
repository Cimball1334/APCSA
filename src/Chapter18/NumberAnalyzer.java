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

import java.lang.reflect.Array;

public class NumberAnalyzer
{
	private static Number[] list = new Number[0];

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
		list = new Number[nums.length];
	
		int loc = 0;
		for(String s : nums) {

			Number n = new Number(Integer.parseInt(s));
			Array.set(list, loc, n);
			
		
			out.println(Arrays.toString(list));

			loc++;
		}
		
	}

	public int countOdds()
	{
      int oddCount=0;
      for(Number n : list) {
    	  if(n.isOdd())
    		  oddCount++;
    	  
      }


      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
      for(Number n : list) {
    	  if(!n.isOdd())
    		  evenCount++;
    	  
      }


      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
		for(Number n : list) {
	    	  if(n.isPerfect())
	    		  perfectCount++;
	    	  
	      }


      return perfectCount;
	}
	
	public String toString( )
	{
		return "" + Arrays.toString(list);
	}
}