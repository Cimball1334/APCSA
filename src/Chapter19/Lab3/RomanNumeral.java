package Chapter19.Lab3;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
    private Integer number;
    private String roman;

    private final static int[] NUMBERS= {1000,900,500,400,100,90,
            50,40,10,9,5,4,1};

    private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
            "L","XL","X","IX","V","IV","I"};

    public RomanNumeral(String str)
    {
        setRoman(str);
    }

    public RomanNumeral(Integer orig)
    {
        setNumber(orig);
    }

    //write a set number method
    public void setNumber(int num)
    {
        number = num;
    }

    //write a set roman method
    public void setRoman(String r)
    {
        roman = r;  
        number = 0;
    }

    //write get methods for number and roman
    @SuppressWarnings("unlikely-arg-type")
	public int getNumber()
    {
    	//roman is a string
    	  int num = 0;
        
    	  
    	  
    	  
          return num; 
       
    }

    public String getRoman()
    {
        String rome = "";
        for(int i = 0; i < NUMBERS.length; i++)
        {
            while(number >= NUMBERS[i]){
                rome += LETTERS[i];
                number -= NUMBERS[i];
            }
        }
        return rome;  
    }

    public int compareTo(RomanNumeral r)
    {
    	
        return 0;
    }

    //write  toString() method
    public String toString()
    {
        if(number > 0){
            return getRoman() + "\n";
        }else{
            getNumber();
        }
        return "";

    }

}