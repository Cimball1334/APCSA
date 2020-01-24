package Chapter16;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for( int i = 2; i < number; i++){
			
			if(number % i == 0) {
				al.add(i);
			}
			
		}
		
		
		
		return al;
	}
	
	public static List<Integer> keepOnlyCompositeNumbers( List<Integer> nums )
	{
		ArrayList<Integer> als = new ArrayList<Integer>();
		
		for (int i : nums) {
			
			ArrayList<Integer> al = new ArrayList<Integer>(getListOfFactors(i)); 
//			System.out.println(al);
			
			if(al.size() > 1) {
				
				als.add(i);
				
			}
		}
		return als;
	}
}