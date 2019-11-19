//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
       LineCounter test = new LineCounter();
       
       test.setLine("9 10 5 20 1 2 3");
       System.out.println(test);
       
       test.setLine("11 22 33 44 55 66 77 5 6 7");
       System.out.println(test);
       
       test.setLine("48 52 29 100 50 293 4");
       System.out.println(test);
       
       test.setLine("0");
       System.out.println(test);
       
       test.setLine("100 90 95 98 100 97");
       System.out.println(test);
       
       
	}
}