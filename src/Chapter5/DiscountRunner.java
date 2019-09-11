//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -
package Chapter5;
import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.println("Bill after discout: " + Discount.getDiscountedBill(amt));
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextDouble();
		out.println("Bill after discout: " + Discount.getDiscountedBill(amt));
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextDouble();
		out.println("Bill after discout: " + Discount.getDiscountedBill(amt));
		
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextDouble();
		out.println("Bill after discout: " + Discount.getDiscountedBill(amt));
		
		
		out.print("Enter the original bill amount :: ");
		 amt = keyboard.nextDouble();
		out.println("Bill after discout: " + Discount.getDiscountedBill(amt));
		
		
		
		

	}
}