package Chapter18;

///A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);
		

		for(int i=0; i<size;i++)
		{

		
			//ask for age
			System.out.print("Enter the age :: ");
			int age = keyboard.nextInt();
		
			//ask for height
			System.out.print("Enter the Height :: ");
			int height = keyboard.nextInt();
			//ask for weight
			System.out.print("Enter the weight :: ");
			int weight = keyboard.nextInt();
			//instantiate a new Monster() and add it to the herd	
			Monster peter = new Monster(age, height, weight);
			System.out.println(peter);
			herd.add(i, peter);
			
		}		
		
		System.out.println("HERD :: " + herd + "\n");
		System.out.println("Oldest :: " + herd.getOldest() + "\n");
		System.out.println("Slimist :: " + herd.getSlimmest() + "\n");
		System.out.println("Tallest :: " + herd.getTallest() + "\n");
	}		
}