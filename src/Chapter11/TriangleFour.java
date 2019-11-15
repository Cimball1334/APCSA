package Chapter11;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TriangleFour
{
    private int size;
    private String letter;

    public TriangleFour()
    {
        setTriangle("",0);
    }

    public TriangleFour(int count, String let)
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
        int math = size;
        for(int i = 1; i <= size; i++)
        {
            for(int k = 1; k <= i - 1; k++)
            {
                output += " ";
            }
            for(int j = math; j >= 1; j--)
            {
                output += getLetter();
                
            }
            math--;
            output += "\n";
        }
        return output+"\n";

    }
}