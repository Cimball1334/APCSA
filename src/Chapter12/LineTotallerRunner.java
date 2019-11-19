package Chapter12;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
       LineTotaller test = new LineTotaller();
       
       test.setLine("1 2 3 4 5 6");
       System.out.println(test);
       
       test.setLine("10 20 30 40 50 60");
       System.out.println(test);
       
       test.setLine("250 657 2154 345 6796");
       System.out.println(test);
       
       test.setLine("0");
       System.out.println(test);
       
       test.setLine("-99 45 -98 92 87");
       System.out.println(test);
       
       
	}
}