package Chapter8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Box
{
	private String word;

	public Box()
	{
	}

	public Box(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		for(int i = 1; i < word.length(); i++) {
			System.out.println((String)(word));
		}System.out.println();
	}
}