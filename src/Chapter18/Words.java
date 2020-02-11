package Chapter18;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

import java.lang.reflect.Array;

public class Words
{
	private Word[] words = new Word[0];

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		String[] wordLs = wordList.split(" ");
		words = new Word[wordLs.length];
		
		int loc = 0;
		for(String s : wordLs) {
			
			Word wd = new Word(s);
			
			Array.set(words, loc, wd);
			System.out.println(Arrays.toString(words));
			loc++;
		}
		
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
		
		for(Word w : words) {
			
			if(w.getNumVowels() == size) {
				count++;
			}
				
			
		}




		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{





		return 0;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;






		return count;
	}
	
	public String toString()
	{
	   return "" ;
	}
}