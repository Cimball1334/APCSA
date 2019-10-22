//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DivisorsRunner
{
	public static void main( String args[] )
	{
	
	    int num = 10;
	    System.out.println(num + " has divisors " + Divisors.getDivisors(num));
	    
	    num = 45;
	    System.out.println(num + " has divisors " + Divisors.getDivisors(num));
	    
	    num = 14;
	    System.out.println(num + " has divisors " + Divisors.getDivisors(num));
	    
	    num = 1024;
	    System.out.println(num + " has divisors " + Divisors.getDivisors(num));
	    
	    num = 1245;
	    System.out.println(num + " has divisors " + Divisors.getDivisors(num));
	    
	    num = 33;
	    System.out.println(num + " has divisors " + Divisors.getDivisors(num));
	    
	    num = 65535;
	    System.out.println(num + " has divisors " + Divisors.getDivisors(num));
	    
	}
}