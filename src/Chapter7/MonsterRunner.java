package Chapter7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*; 

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monsters name : ");
		String firstName = input.nextLine();
		System.out.println("Enter 1st monsters size : ");
		int firstSize = input.nextInt()
;		//instantiate monster one
		Monster m1 = new Monster(firstName,firstSize);
		
		//ask for name and size
		System.out.println("Enter 2nd monsters name : ");
		String secondName = input.nextLine();
		System.out.println("Enter 2nd monsters size : ");
		int secondSize = input.nextInt();
		//instantiate monster two
		Monster m2 = new Monster(secondName,secondSize);
		
		if(m1.isBigger(m2))
			out.println("Monster 1 is bigger than Monster 2");
		else out.println("Monster 1 is not bigger than Monster 2");
		
		if(m1.namesTheSame(m2))
			out.println("Monster 1 has the same name as Monster 2");
		else out.println("Monster 1 does not have the same name as Monster 2");
		
	}	
}