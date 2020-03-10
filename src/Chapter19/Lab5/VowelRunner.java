package Chapter19.Lab5;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class VowelRunner

{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("word.dat"));

        int size = file.nextInt();
        Comparable[] wordList = new Vowel[size+1];

        for(int i = 0; i <= size; i++)
        {

            Vowel test = new Vowel(file.nextLine());
            wordList[i] = test;

        }

        Arrays.sort(wordList);

        for(Comparable it : wordList)
        {
            System.out.println(it);   
        }

    }
}