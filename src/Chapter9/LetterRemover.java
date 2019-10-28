package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("test", 't');
	}

	public LetterRemover(String s, char rem) {
		setRemover( s,  rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int loc = sentence.indexOf(lookFor);
		
		String cleaned=sentence;
		
		while(cleaned.indexOf(lookFor) != -1) {
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor +"\n" + removeLetters() + "\n";
	}
}