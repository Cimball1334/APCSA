//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
package Chapter5;
import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);
		StringOddOrEven test = new StringOddOrEven();
	
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
		
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
		
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
		
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
		
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
		
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
		
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
		
		out.println("Enter a word :: ");
		test.setString(input.nextLine());
		out.println(test);
	}
}