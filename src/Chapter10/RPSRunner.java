//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;


public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response = 'y';
        RPS game = new RPS();   
        //add in a do while loop after you get the basics up and running
        do{
            String player = "";
        
                System.out.print("Rock Paper Scissors! [R,P,S] :: ");
            player = keyboard.next();
            game.setPlayers(player);
            System.out.println(game);
            System.out.println("Do you want to play again?");
            response = keyboard.next().charAt(0);
        }while(response == 'y');
        
                
    }
}



