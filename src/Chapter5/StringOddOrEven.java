//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
package Chapter5;
import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		int num = word.length();
		if(NumberVerify.isEven(num) == true) {
			return true;
		}
 		return false;
	}

 	public String toString()
 	{
 		String output = "";
 		if(isEven() == true)
 		{
 			 output= word  + " is Even";
 		}else {
 			 output= word  + " is Odd";
 		}

 		return output;
	}
}