public class LetterDelete
{
    private String word; 
    private char letter;

    public LetterDelete()
    {
        setVars("", ' ');
    }

    public LetterDelete(String s, char l)
    {
        setVars(s, l);
    }

    public void setVars(String s, char l)
    {
        word = s;
        letter = l;
    }

    public String getWord()
    {
        return word;
    }

    public char getLetter()
    {
        return letter;
    }

    public String delete()
    {
        String temp = getWord();
        for(int x = 0; x < temp.length(); x++)
        {
            if(temp.charAt(x) == letter)
            {
                temp = temp.substring(0, x) + "" + temp.substring(x + 1);
                x--;
            }
        }
        return temp;
    }

    public static void main(String[] args)
    {
        LetterDelete test = new LetterDelete("Sudowoodo", 'o');

        System.out.println("Your word is: " + test.getWord());
        System.out.println("I will delete every: " + test.getLetter());
        System.out.println("The result is: " + test.delete());
    }
}
