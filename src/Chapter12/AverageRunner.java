//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class AverageRunner
{
   public static void main( String args[] )
   {
       Average test = new Average();
       
       test.setLine("9 10 5 20");
       System.out.println(test);
       
       test.setLine("11 22 33 44 55 66 77");
       System.out.println(test);
       
       test.setLine("48 52 29 100 50 29");
       System.out.println(test);
       
       test.setLine("0");
       System.out.println(test);
       
       test.setLine("100 90 95 98 100 97");
       System.out.println(test);
       
	}
}