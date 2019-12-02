//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.lang.Math;

public class PrimesRunner
{
	public static void main( String args[] ) throws IOException
	{
	    Scanner file = new Scanner(new File("primes.dat"));
	    int size = file.nextInt();
	    file.nextLine();
	    for(int i = 0; i < size; i++)
        {
            int num = file.nextInt();
            //instantiate an OddOrEven
            Primes test = new Primes();
            test.setPrime(num);
            System.out.println(test);
        }
	}
}