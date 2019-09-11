package Chapter5;

//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(getASCII() > 65 && getASCII() < 91 ) return true;
		return false;
	}

	public boolean isLower( )
	{
		if(getASCII() > 96 && getASCII() < 123 ) return true;
		return false;
	
	}
	
	public boolean isNumber( )
	{
		if(getASCII() > 47 && getASCII() < 58 ) return true;
		return false;
	}	

	public int getASCII( )
	{
		return (int)(theChar);
	}

	public String toString()
	{
		if(isUpper()) return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		
		
		if(isLower()) return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	 
		
		if(isNumber()) return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	 
		
		
		
		return "";
	}
}