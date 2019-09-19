package Chapter6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum = 0;

	public Social()
	{
	}
	public Social(String soc)
	{
		setWord(soc);
	}
	public void setWord(String w)
	{
		socialNum = w;
	}
	public void chopAndAdd()
	{
		String sub = socialNum;
		sub = socialNum.substring(0, socialNum.indexOf("-"));
		sum += Integer.parseInt(sub);
		sub = socialNum.substring(socialNum.indexOf("-") + 1, socialNum.lastIndexOf("-"));
		sum += Integer.parseInt(sub);
		sub = socialNum.substring(socialNum.lastIndexOf("-") + 1);
		sum += Integer.parseInt(sub);
		
	}

	public String toString()
	{
		chopAndAdd();
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}