package Chapter13;

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

    private int getLowest()
    {
        int lowest=Integer.MAX_VALUE;
        
        Scanner findLowest = new Scanner(line);
        
        while(findLowest.hasNextInt())
        {
            int num = findLowest.nextInt();
            
            if(num < lowest)
            {
                lowest = num;
            }
        }
        

        return lowest;
    }

    public double getAverage()
    {
        double average=0.0;
        int sum = 0;
        int number = 0;
        int counter = 0;
        int add =0;
       
       Scanner chopper = new Scanner(line);
       
       
       while(chopper.hasNextInt())
       {
           int tester = chopper.nextInt();
           if(tester != getLowest())
           {
               add = tester;
               sum += add;
               number++;
           }
          else 
          {
            if(counter == 1)
            {
                 add = tester;
               sum += add;
               number++;
            }
            counter++;
            }
           
           
        }

        average = (double)sum / number;

        return average;
    }

    public String getLine()
    {
        return line;
        }


    public String toString()
    {
        return  line + "\n" + "Average == " + getAverage() + "\n";
    }


}