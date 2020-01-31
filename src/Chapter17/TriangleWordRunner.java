//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
        String choice = "";
        do{
            System.out.println("Enter a word :: ");
            String word = input.next();

            TriangleWord.printTriangle(word);

            System.out.print("\n\nDo you want to enter more sample input? ");
            choice = input.next();

        }while(choice.equals("Y") || choice.equals("y"));

        
    }
}