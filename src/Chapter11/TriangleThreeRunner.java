package Chapter11;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.util.Scanner;

public class TriangleThreeRunner
{
   public static void main( String args[] )
   {
       Scanner keyboard = new Scanner(System.in);
        String choice="";
        do{
            System.out.print("Enter the size of the triangle : ");
            int big = keyboard.nextInt();
            System.out.print("Enter a letter : ");
            String value = keyboard.next();

            //instantiate a TriangleTwo object
            TriangleThree tw = new TriangleThree( big, value );
            
            //call the toString method to print the triangle 
            System.out.println(tw);
          
            System.out.print("Do you want to enter more data? ");
            choice=keyboard.next();
        }while(choice.equals("Y")||choice.equals("y"));
       
   }
}