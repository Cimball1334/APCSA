//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
	    word = s;
	}

	public int compareTo( Word rhs )
	{		
	    Word other = (Word)rhs;
	    if(word.length()> other.word.length())
	    {
	        return 1;
	       }else if(word.length() == other.word.length())
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
		return "" + word;
	}
}