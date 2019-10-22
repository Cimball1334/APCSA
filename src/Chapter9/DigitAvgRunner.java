package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DigitAvgRunner
{
    public static void main( String args[] )
    {
        int number = 234;
        System.out.println(number + " has a digit average of " + DigitAvg.averageDigits(number) + "\n");

        number = 10000;
        System.out.println(number + " has a digit average of " + DigitAvg.averageDigits(number) + "\n");
        
        number = 111;
        System.out.println(number + " has a digit average of " + DigitAvg.averageDigits(number) + "\n");
        
        number = 9005;
        System.out.println(number + " has a digit average of " + DigitAvg.averageDigits(number) + "\n");
        
        number = 84645;
        System.out.println(number + " has a digit average of " + DigitAvg.averageDigits(number) + "\n");
        
        number = 8547;
        System.out.println(number + " has a digit average of " + DigitAvg.averageDigits(number) + "\n");
        
        number = 123456789;
        System.out.println(number + " has a digit average of " + DigitAvg.averageDigits(number) + "\n");
    }
}