package Chapter3;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		int x1 , x2, y1, y2;
		

		
		System.out.println("Enter x1 ::");
		x1 = keyboard.nextInt();
		
		System.out.println("Enter y1 ::");
		y1 = keyboard.nextInt();
		
		System.out.println("Enter x2 ::");
		x2 = keyboard.nextInt();
		
		System.out.println("Enter y2 ::");
		y2 = keyboard.nextInt();
		
		Distance test = new Distance(x1,y1,x2,y2);
		test.calcDistance();
		test.print();
		
		System.out.println("Enter x1 ::");
		x1 = keyboard.nextInt();
		
		System.out.println("Enter y1 ::");
		y1 = keyboard.nextInt();
		
		System.out.println("Enter x2 ::");
		x2 = keyboard.nextInt();
		
		System.out.println("Enter y2 ::");
		y2 = keyboard.nextInt();
		
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		System.out.println("Enter x1 ::");
		x1 = keyboard.nextInt();
		
		System.out.println("Enter y1 ::");
		y1 = keyboard.nextInt();
		
		System.out.println("Enter x2 ::");
		x2 = keyboard.nextInt();
		
		System.out.println("Enter y2 ::");
		y2 = keyboard.nextInt();
		
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		
		
		
			
	}
}