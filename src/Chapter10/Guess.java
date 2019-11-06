package Chapter10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Scanner;

public class Guess
{
    private int upperBound;

    public Guess(int stop)
    {
        setUpperBound(stop); 
    }

    public void setUpperBound(int stop)
    {
        upperBound = stop;
    }

    public void playGame()
    {
        Scanner keyboard = new Scanner(System.in);
        int compNumber = 0;
        int userNumber = -5;
        int counter = 0;
        double percent = 0.0;
        compNumber = (int)(Math.random() * upperBound) + 1;

        while(compNumber != userNumber)
        {
            System.out.println("Enter a number between 1 and " + upperBound);
            userNumber = keyboard.nextInt();
            if(userNumber < 1 || userNumber > upperBound)
            {
             System.out.println("Number out of rage");   
            }else
            {
             counter++;   
            }
            
            if(userNumber == compNumber)
            {
                System.out.println("It took " + counter + " guesses to guess " + compNumber);
                percent = (1.0 / counter) * 100;
                percent = 100 - percent;
                System.out.println("You guessed wrong " + percent + " percent of the time");
            }
            
        }

    }
    public String toString()
    {
        String output="";
        playGame();
        return output;
    }
}