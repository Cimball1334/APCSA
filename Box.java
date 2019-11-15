//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Box
{
   private int size;

	public Box()
	{
	    setSize(0);
	}

	public Box(int count)
	{
	    setSize(count);
	}

	public void setSize(int count)
	{
	    size = count;
	}

	public int getSize()
	{
		return size;
	}

	public String toString()
	{
		String output="";
		
		for(int i = 1; i <= size; i+=-(i-(i+1)))
		{
		    for(int j = 1; j <= (size + 1) - i; j++)
		    {
		        output += "*";
		      }
		      for(int k = 1; k <= i; k++)
		      {
		          output += "#";
		      }
		      output += "\n";
		  }
		
		
		return output + "\n\n";
	}
}