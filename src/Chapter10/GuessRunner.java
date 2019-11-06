//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class GuessRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response = 'y';
        int range = 0;
        Guess test = new Guess(0);
        
        do{
            System.out.println("Guessing Game - how many numbers?");
            range = keyboard.nextInt();
            test.setUpperBound(range);
            System.out.println(test);
          
            System.out.println("Do you want to play again?");
            response = keyboard.next().charAt(0);
            
          }while(response == 'y');
    }
}