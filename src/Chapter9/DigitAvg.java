package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DigitAvg
{
   private static int countDigits( int number )
    {
        int sum=0;
        
        while(number > 0)
        {
            sum++;
            number = number / 10;
            
          }
        return sum;
    }

    private static int sumDigits( int number )
    {
        int sum=0;
        
        while(number > 0)
        {
            
            sum += number % 10;
            number = number / 10;
            
            
          }
        return sum;
    }

    public static double averageDigits( int number )
    {
        
        
        return (double)sumDigits(number) / countDigits(number);
    }
}