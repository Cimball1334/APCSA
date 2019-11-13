package Chapter11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
	}

	public TriangleTwo( String let, int sz)
	{
		setTriangle(sz,let);
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";

		for(int i = 1; i <=size; i++) {
			
			for(int j = size; j >= i; j--) {
				output+=getLetter();
			}
			output+="\n";
			
		}
		
		return output+"\n";
	}
}