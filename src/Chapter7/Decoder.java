package Chapter7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Decoder
{
	private char letter;

	public Decoder()
	{

		

	}

	public Decoder(char let)
	{

		setLetter(let);

	}

	public void setLetter(char let)
	{

		letter = let;

	}

	public char deCode()
	{
		char result=0;
		if(letter >= 48 && letter <=57) {
			result = (char)(17+letter);
		}else if (letter >= 65 && letter <=90) {
			result = (char)(32+letter);
		}else if (letter>= 97 && letter <=122) {
			result = (char)(letter -32);
		}else {
			result = '#';
		}
		return result;
	}

	public String toString()
	{
		return letter + " decodes to " + deCode();
	}
}