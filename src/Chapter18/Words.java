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

public class Words {
	private ArrayList<Word> words = new ArrayList(0);

	public Words() {
		setWords("");
	}

	public Words(String wordList) {
		setWords(wordList);
	}

	public void setWords(String wordList) {
		String[] wordLs = wordList.split(" ");

		words = new ArrayList(wordLs.length);

		int loc = 0;
		for (String s : wordLs) {

			Word wd = new Word(s);
			System.out.println(s);
			words.add(wd);
//			Array.set(words, loc, wd);
			System.out.println(words);

			loc++;
		}

	}

	public int countWordsWithXChars(int size) {
		int count = 0;

		for (Word w : words) {

			if (w.getLength() == size) {
				count++;
			}

		}

		return count;
	}

	// this method will remove all words with a specified size / length
	// this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size) {
		ArrayList<Word> newWords = new ArrayList(0);

		int count = 0;
		for (Word w : words) {

			if (w.getLength() == size) {
				
				//System.out.println(words);
				count += w.getLength();
			} else {
				newWords.add(w);
			}

		}
		words = newWords;
		return count;
	}

	public int countWordsWithXVowels(int numVowels) {
		int count = 0;

		for (Word w : words) {

			if (w.getNumVowels() == numVowels) {
				count++;
			}

		}

		return count;
	}

	public String toString() {
		return "" + words;
	}
}