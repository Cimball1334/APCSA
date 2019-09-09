//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package Chapter4;
import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
	}

	public StringChecker(String s)
	{
		this.setString(s);
	}

   public void setString(String s)
   {
   	word=s;
  
   }

	public boolean findLetter(char c)
	{
		for(int x = 0; x < word.length()-1; x ++) {
			
			if(word.charAt(x) == c) {
				return true;
			}
			
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		if(word.indexOf(s) != -1) {
			return true;
		}
	
		return false;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}