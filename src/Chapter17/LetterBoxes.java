package Chapter17;//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxes
{
    //instance variables and constructors could be present, but are not necessary

    public static void printBox(char letter, int size)
    {
        for(int i = size; i > 0; i--) {
            System.out.println();
            for(int j = size; j > 0; j--) {
                System.out.print(letter);
            }
        }
        System.out.println();
    }
}