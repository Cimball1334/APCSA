package Chapter19.Lab4;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("words.dat"));
        
        int size = file.nextInt();
        Comparable[] wordList = new Word[size+1];
        
        for(int i = 0; i <= size; i++)
        {
            
            Word test = new Word(file.nextLine());
            wordList[i] = test;
        
        }
      
        Arrays.sort(wordList);
        
        for(Comparable it : wordList)
        {
         System.out.println(it);   
        }
    }
}