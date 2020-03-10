//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class Vowel implements Comparable<Vowel>
{
    private String word;
 
    public Vowel( String s)
    {
        word = s;
    }

    private int numVowels()
    {
        String vowels = "AEIOUaeiou";
        int vowelCount=0;

        for(int i = 0; i < word.length(); i++)
        {
            for(int j = 0; j < vowels.length (); j++)
        {
            if(word.charAt(i) == vowels.charAt(j))
            vowelCount++;
        }
        }

        return vowelCount;
    }

    public int compareTo(Vowel rhs)
    {
        Vowel other = (Vowel) rhs;
        if(numVowels() > other.numVowels())
        {
            return 1;
        }else if(numVowels() == other.numVowels())
        {
            for(int i = 0; i < word.length(); i++)
	        {
	            if((int)word.charAt(i) > (int)other.word.charAt(i))
	            {
	                return 1;
	           }else if((int)word.charAt(i) < (int)other.word.charAt(i))
	           return -1;
	            return 0;
	       }
        }
        return -1;
    }

    public String toString()
    {
        return word;
    }
}