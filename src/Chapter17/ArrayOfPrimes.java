package Chapter17;//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class ArrayOfPrimes
{
    //instance variables and constructors could be present, but are not necessary

    //getPrimeList(int numPrimes) will return an array 
    //containing the first numPrimes primes starting at 2
    public static int[] getPrimeList(int numPrimes)
    {

        
        return getPrimeList(numPrimes,1); //just call a method here
    }

    //getPrimeList(int numPrimes, int primeStart) will return an array 
    //containing the first numPrimes primes starting at primeStart
    public static int[] getPrimeList(int numPrimes, int primeStart)
    {
        int[] primes = new int[numPrimes];      
        // you must call isPrime 
        int num = primeStart + 1;
        int loc = 0;
        while(primes[numPrimes - 1] == 0)
        {
            if(isPrime(num))
            {
                primes[loc] = num;
                loc++;
            }
            num++;

        }        
        return primes;
    }

    //isPrime will return true if num is prime
    //a prime number is any number ony divisible by 1 and itself
    private static boolean isPrime(int num)
    {
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                return false;   
            }
        }

        return true;
    }
}