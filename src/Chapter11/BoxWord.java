package Chapter11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

class BoxWord
{
   private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{
		setWord(s);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";
		output+=word + "\n";
			for(int a = 1; a <word.length()-1; a++) {
				output+= word.charAt(a);
				for(int b = 0; b <word.length()-2; b++){
				output+=" ";
				}
				output+= word.charAt(word.length()-a-1);
				output+="\n";
			}
			// print the reverse
			String reverse = "";
			 for(int i = word.length() - 1; i >= 0; i--)
		        {
		            reverse = reverse + word.charAt(i);
		        }
			output+= reverse;
	
		return output+"\n";
	}
}