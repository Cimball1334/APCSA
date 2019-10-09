	package Chapter8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Backwards
{
	private String word;

	public Backwards()
	{
	}

	public Backwards(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word=s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		
		String back="";
		for(int i =0; i < word.length(); i++) {
			back = back+word.charAt(word.length()- 1 - i); 
		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word;
	}
}