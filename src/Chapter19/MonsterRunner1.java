package Chapter19;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner1
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.println("Enter 1st monsters size : ");
		int size = keyboard.nextInt();
		
		//instantiate monster one
		Monster1 one = new Monster1(name,size);
		
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
		 name = keyboard.next();
		System.out.println("Enter 2nd monsters size : ");
		 size = keyboard.nextInt();
		
		Monster1 two = new Monster1(name,size);
		//instantiate monster two
	}
}