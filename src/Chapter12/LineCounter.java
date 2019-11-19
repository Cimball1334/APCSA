package Chapter12;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class LineCounter
{
    private String line;

    public LineCounter()
    {
        setLine("");
    }

    public LineCounter(String s)
    {
        setLine(s);
    }

    public void setLine(String s)
    {
        line = s;
    }

    public int getCount()
    {
        int count=0;
        Scanner chopper = new Scanner(line);
        while(chopper.hasNextInt())
        {
            chopper.nextInt();
            count++;
        }

        return count;
    }

    public String getLine()
    {
        return line;
    }

    public String toString()
    {
        String output = getLine();
        return output += "\ncount = " + getCount() + "\n";
    }
}