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
		String name = input.next();
		System.out.println("Enter 1st monsters size : ");
		int size = input.nextInt()
;		//instantiate monster one
		Monster m1 = new Monster(name, size);
		out.println("\n");
		//ask for name and size
		System.out.println("Enter 2nd monsters name : ");
		name = input.next();
		System.out.println("Enter 2nd monsters size : ");
		 size = input.nextInt();
		//instantiate monster two
		Monster m2 = new Monster(name ,size);
		
		if(m1.isBigger(m2))
			out.println("Monster 1 is bigger than Monster 2");
		else out.println("Monster 1 is not bigger than Monster 2");
		
		if(m1.namesTheSame(m2))
			out.println("Monster 1 has the same name as Monster 2");
		else out.println("Monster 1 does not have the same name as Monster 2");
		
	}	
}