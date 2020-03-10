//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
    //add two instance variables
    private int numerator;
    private int denominator;
    //write two constructors
    public Rational()
    {
        setRational(1,1);
    }

    public Rational(int n, int d)
    {
        setRational(n,d);
    }

    //write a setRational method
    public void setRational(int n, int d)
    {
        setNumerator(n);
        setDenominator(d);
    }

    //write  a set method for numerator and denominator
    public void setNumerator(int n)
    {
        numerator = n;   
    }

    public void setDenominator(int d)
    {
        denominator = d;
    }

    public void add(Rational  other)
    {
        //num1/den1 + num2/den2 
        //new numerator = (num1 * den2 + num2 * den1)
        //new denominator = (den1 * den2)
        numerator = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
        denominator = denominator * other.getDenominator();
        //System.out.println(numerator + " " + denominator);
        reduce();
    }

    private void reduce()
    {


    }

    private int gcd(int numOne, int numTwo)
    {

        return 1;
    }

    public Object clone ()
    {
        Rational dog = new Rational();
        return dog;
    }

    //ACCESSORS
    //write get methods for numerator and denominator
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public boolean equals( Object obj)
    {
        Rational eq = (Rational) obj;
        if(numerator == eq.getNumerator() && denominator == eq.getDenominator())
        return true;
        return false;
    }

    public int compareTo(Rational other)
    {
        Rational co = (Rational) other;
        return -1;
    }


    //write  toString() method
    public String toString()
    {
        return numerator + " / " + denominator;
    }
}