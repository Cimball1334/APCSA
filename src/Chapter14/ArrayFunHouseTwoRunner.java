package Chapter14;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;

public class ArrayFunHouseTwoRunner {
	public static void main( String args[] )
	{
	
		int[] one   = {1,2,3,4,5,6,7,8,9,10};
		int[] two   = {1,2,3,9,11,20,30};
		int[] three = {9,8,7,6,5,4,3,2,0,-2};
		int[] four  = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,6,3,2,1};
	
		System.out.println(Arrays.toString(one));
		System.out.println("is going up? " + ArrayFunHouseTwo.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going up? " + ArrayFunHouseTwo.goingUp(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going up? " + ArrayFunHouseTwo.goingUp(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going up? " + ArrayFunHouseTwo.goingUp(four) + "\n\n");
		
		System.out.println(Arrays.toString(one));
		System.out.println("is going down? " + ArrayFunHouseTwo.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going down? " + ArrayFunHouseTwo.goingDown(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going down? " + ArrayFunHouseTwo.goingDown(three));
		System.out.println(Arrays.toString(four));
		System.out.println("is going down? " + ArrayFunHouseTwo.goingDown(four)+ "\n\n");
		
		System.out.println(Arrays.toString(four));
		System.out.println("first 7 values greater than 9 " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(four, 7, 9)));
		
		
	}
}