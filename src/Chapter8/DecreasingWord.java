package Chapter8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DecreasingWord
{
	private String word;

	public DecreasingWord()
	{
		word="";
	}

	public DecreasingWord(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		for(int x = 0; x < word.length(); x++) {
			System.out.println(word.substring(0,word.length()-x));
		}
		System.out.println();
	}
}