//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class DigitCounterRunner
{
    public static void main( String args[] )
    {

        int number = 234;
        System.out.println(number + " cointains " + DigitCounter.countDigits(number) + " digits\n");

        number = 10000;
        System.out.println(number + " cointains " + DigitCounter.countDigits(number) + " digits\n");
        
        number = 111;
        System.out.println(number + " cointains " + DigitCounter.countDigits(number) + " digits\n");
        
        number = 9005;
        System.out.println(number + " cointains " + DigitCounter.countDigits(number) + " digits\n");
        
        number = 84645;
        System.out.println(number + " cointains " + DigitCounter.countDigits(number) + " digits\n");
        
        number = 8547;
        System.out.println(number + " cointains " + DigitCounter.countDigits(number) + " digits\n");
        
        number = 123456789;
        System.out.println(number + " cointains " + DigitCounter.countDigits(number) + " digits\n");
    }
}