package Chapter13;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import java.lang.Math;

public class Primes
{
    private int number;

    public Primes()
    {
        setPrime(0);
    }

    public Primes(int num)
    {
        setPrime(num);
    }

    public void setPrime(int num)
    {
        number = num;
    }

    public boolean isPrime()
    {
        boolean prime = true;
        
        for(int i = 2; i < number; i++)
        {
         if(number % i == 0)   
         {
             prime = false;
            }
        }
        
        return prime;
    }




    public String toString()
    {
        if(isPrime())
        {
            return number + " IS PRIME";
        }
        
        return number + " IS NOT PRIME";
    }
}