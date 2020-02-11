package Chapter18;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word {
	private static String word;
	private static String vowels = "AEIOUaeiou"; // only one

	public Word() {

	}

	public Word(String wrd) {
		setWord(wrd);
	}

	public void setWord(String wrd) {
		word = wrd;
	}

	public int getNumVowels() {
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			String c = word.substring(i,i+1);
		
			if (vowels.contains((String) c)) {
				count ++;
			}
		}
		return count;
	}

	public int getLength() {
		return word.length();
	}

	public String toString() {
		return "" + word;
	}
}