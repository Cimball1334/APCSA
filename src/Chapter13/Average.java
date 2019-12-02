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
        //int test = line.lastIndexOf(getLowest() + "");
       // System.out.println("index of" + test);
        //if(getLowest() < 10)
        //{
             //line = line.substring(0,test) + "" + line.substring(test + 1, line.length());
       // }else
        //{
            //line = line.substring(0,test) + "" + line.substring(test + 2, line.length());
            //}
        //line = line.substring(0,test -1) + "" + line.substring(test + 1, line.length());
       //System.out.println("line is " +line);
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
        System.out.println("num of nums " + number);
        System.out.println("sum of nums " + sum);
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