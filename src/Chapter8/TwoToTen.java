package Chapter8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TwoToTen
{
	private String binary;

	public TwoToTen()
	{
	}

	public TwoToTen(String bin)
	{
		setTwo(bin);
	}

	public void setTwo(String bin)
	{
		binary = bin;
	}

	public long getBaseTen( )
	{
		long ten=0;
		for(int i = binary.length()-1; i >= 0 ; i-- ) {
			if(binary.charAt(i) == '1' ) {
				 ten += Math.pow(2 , (binary.length() - 1) - i);
			}
		}
		return ten;
	}

	public String toString()
	{
		return binary + " == " + getBaseTen();
	}
}