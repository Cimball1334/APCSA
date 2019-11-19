//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class Average
{
    private String line;

    public Average()
    {
        setLine("");
    }

    public Average(String s)
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

    public int getSum()
    {
        int sum=0;
        Scanner sumChopper = new Scanner(line);
        while(sumChopper.hasNextInt())
        {
            sum += sumChopper.nextInt();

        }
        return sum;
    }

    public double getAverage()
    {
        double average=0.0;
        
        average = 
        (double)getSum() / getCount();
        
        return average;
    }

    public String getLine()
    {
        return line;
    }

    public String toString()
    {
      String output = getLine();
      return output += "\naverage = " + getAverage() + "\n";
    }
}