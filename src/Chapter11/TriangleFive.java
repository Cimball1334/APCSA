//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class TriangleFive
{
    private char letter;
    private int amount;

    public TriangleFive()
    {
    }

    public TriangleFive(char c, int amt)
    {
        setLetter(c);
        setAmount(amt);
    }

    public void setLetter(char c)
    {
        letter = c;
    }

    public void setAmount(int amt)
    {
        amount = amt;
    }

    public String toString()
    {
        String output="";
        int fakeAmount = amount;
        char fakeLetter = letter;
        for(int k = amount; k >= 1; k--)
        {
            fakeAmount = amount;
            letter = fakeLetter;
        for(int i = 1; i  <= k; i++)
        {
            for(int j = fakeAmount; j >= 1;  j--)
            {
                if(letter > 90) letter =(char)(letter - 26);
                output += letter;
               
            }
            output += " ";
            fakeAmount--;
            letter++;
        }
        output += "\n";
    }
        return output + "\n";
    
}
}