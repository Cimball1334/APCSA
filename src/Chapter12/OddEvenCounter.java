//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

public class OddEvenCounter
{
    private String line;

   public OddEvenCounter()
   {
       setLine("");
   }

   public OddEvenCounter(String s)
   {
       setLine(s);
   }

    public void setLine(String s)
    {
        line = s;
    }

    public int getEvenCount()
    {
        int count= 0;
        Scanner evenChopper = new Scanner(line);
        
        while(evenChopper.hasNextInt())
        {
            if(evenChopper.nextInt() % 2 == 0)
            {
                count++;
              }
          }
        
        return count;
    }

    public int getOddCount()
    {
        int count= 0;
        Scanner oddChopper = new Scanner(line);
        
        while(oddChopper.hasNextInt())
        {
            if(oddChopper.nextInt() % 2 != 0)
            {
                count++;
              }
          }
        
        return count;
    }

    public String toString( )
    {
        String output = line;
        output += "\neven count = " + getEvenCount();
        return output += "\nodd count = " + getOddCount();
    }
}