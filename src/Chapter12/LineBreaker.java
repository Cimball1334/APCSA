//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class LineBreaker
{
    private String line;
    private int breaker;

    public LineBreaker()
    {
        setLineBreaker("",0);
    }

    public LineBreaker(String s, int b)
    {
        setLineBreaker(s,b);
    }

    public void setLineBreaker(String s, int b)
    {
        line = s;
        breaker = b;
    }

    public String getLine()
    {
        return line;
    }

    public String getLineBreaker()
    {
        String box ="";
        int counter = 0;
        Scanner chopper = new Scanner(line);
        
        while(chopper.hasNext())
        {
            box += chopper.next();
            counter++;
           if(counter == breaker)
           {
             counter = 0;
             box += "\n";
            }
        }


        return box;
    }

    public String toString()
    {
        String output = getLine()+ "\n";
        return output += getLineBreaker() + "\n";
    }
}