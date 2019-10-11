import java.util.Scanner;
import java.math.*;
public class Morty {
static Scanner input = new Scanner(System.in);
	public static void main(String arg[])
	{	
		int count = input.nextInt();
		for(int i = 1; i <= count; i++) {
		double first = input.nextDouble();
		double second = input.nextDouble();
		System.out.println(first + second);
//		double total = first + second;
//		double holder = (first + second) % 1;
//		System.out.println((int)(total / 1) + (Math.round(holder*10))/10);
			
		}
	}
}

