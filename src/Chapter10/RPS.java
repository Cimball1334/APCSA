package Chapter10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.lang.Math;

public class RPS
{
private String playChoice;
private String compChoice;
public RPS()
{setPlayers(""); }public RPS(String player)
{setPlayers(player);}public void setPlayers(String player){playChoice = player;}public String determineWinner(){String winner="";int comp = 0;comp  = (int)(Math.random() * 3);switch(comp) {case 0: if(playChoice.equals("R")){winner = "player had R \ncomputer had R \n!Draw Game!";} else if(playChoice.equals("P")){winner = "player had P \ncomputer had R \n!Player wins <<Paper Covers Rock>>!";}else winner = "player had S \ncomputer had R!Computer wins <<Rock Breaks Scissors>>!";break; case 1: if(playChoice.equals("R")){winner = "player had R \ncomputer had P \n!Computer wins <<Paper Covers Rock>>!";} else if(playChoice.equals("P")){ winner = "player had P \ncomputer had P \n!Draw Game!";}else winner = "player had S \ncomputer had P \n!Player wins <<Scissors Cuts Paper>>!";break; case 2: if(playChoice.equals("R")){winner = "player had R \ncomputer had S \n!Player wins <<Rock Breaks Scissors>>!";} else if(playChoice.equals("P")){winner = "player had P \ncomputer had S \n!Computer wins <<Scissors Cuts Paper>>!";}else winner = "player had S \ncomputer had S \n!Draw Game!";break; }return winner;}public String toString(){String output = "";output = determineWinner();	return output;
	}
}