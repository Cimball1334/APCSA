package Chapter11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

class TriangleWord
{
   private String word = " ";

	public TriangleWord()
	{
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		   String output = " ";
		   
		   int len = word.length()-1, idx = 1;

		    System.out.println(String.format("%"+(len+1)+"s", word.charAt(0)));
		    for(int x=0; x<word.length()-2; x++){
		        System.out.print(String.format("%"+(len--)+"s", word.charAt(idx)));
		        System.out.println(String.format("%"+(idx*2)+"s", word.charAt(idx++)));
		    }
		    System.out.println(new StringBuilder(word.substring(1)).reverse().toString() + word);
		
		   		   
		return output;
	}
	
	
}