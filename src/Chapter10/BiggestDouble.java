package Chapter10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

public class BiggestDouble
{
    private double one,two,three,four;

    public BiggestDouble()
    {
        this(0,0,0,0);
    }

    public BiggestDouble(double a, double b, double c, double d)
    {
        setDoubles(a,b,c,d);
    }

    public void setDoubles(double a, double b, double c, double d)
    {
        one = a;
        two = b;
        three = c;
        four = d;
    }

    public double getBiggest()
    {
        if(one - two > 0 && one - three > 0 && one - four > 0)
        {
         return one;   
        }else if(two - one > 0 && two - three > 0 && two - four > 0)
        {
         return two;   
        }else if(three - one > 0 && three - two > 0 && three - four > 0)
        {
         return three;   
        }else if(four - one > 0 && four - two > 0 && four - three > 0)
        {
         return four;   
        }
        
        
        
        
        
        return 0.0;
    }

    public String toString()
    {
       return one + " " + two + " " + three + " " + four + "\nbiggest = " + getBiggest();
    }
}