//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package Chapter3;

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);

   	//add test cases
		System.out.print("Enter A ::  ");
		int quadA  = keyboard.nextInt();

		System.out.print("Enter B ::  ");
		int quadB = keyboard.nextInt();

		System.out.print("Enter C ::  ");
		int quadC = keyboard.nextInt();
		
		Quadratic test = new Quadratic(quadA,quadB,quadC);
		test.calcRoots();
		test.print();
		
		System.out.print("Enter A ::  ");
		 quadA  = keyboard.nextInt();

		System.out.print("Enter B ::  ");
		 quadB = keyboard.nextInt();

		System.out.print("Enter C ::  ");
		 quadC = keyboard.nextInt();
		
		test.setEquation(quadA,quadB,quadC);
		test.calcRoots();
		test.print();


		System.out.print("Enter A ::  ");
		 quadA  = keyboard.nextInt();

		System.out.print("Enter B ::  ");
		 quadB = keyboard.nextInt();

		System.out.print("Enter C ::  ");
		 quadC = keyboard.nextInt();
		
		test.setEquation(quadA,quadB,quadC);
		test.calcRoots();
		test.print();
   	
		
		
	}
}