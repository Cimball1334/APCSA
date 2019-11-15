package Chapter11;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	    setTriangle("",0);
	}

	public TriangleThree(int count, String let)
	{
	    setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
	    letter = let;
	    size = sz;
	}

	public String getLetter() 
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		
		for(int i = 1; i <= size; i++)
		{
		   for(int j = 1; j <= size - i; j++)
		   {
		       output += " ";
		      }
		   for(int k = 1; k <= i; k++)
		   {
		       output += getLetter();
		      }
		      output += "\n";
		  }
		
		return output+"\n";
	}
}