package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

class StringRemover
{
   private String sentence;
   private String remove;

	public StringRemover() {
		
	}
	
	public StringRemover(String s, String rem) {
		setRemover( s,  rem);
	}
	

	public void setRemover(String s, String rem)
	{
		
	}

	public String removeStrings()
	{
		String cleaned = sentence;
	
		
		int loc = sentence.indexOf(remove);

		while(cleaned.indexOf(remove) != -1) {
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + remove.length());
			loc = cleaned.indexOf(remove);
		}
		return cleaned;
	}
	

	public String toString()
	{
		return sentence + " - string to remove " + remove +"\n" + removeStrings() + "\n";
	}
}