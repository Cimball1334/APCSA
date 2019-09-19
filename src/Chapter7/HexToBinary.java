package Chapter7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class HexToBinary
{
	private char hex;

	public HexToBinary()
	{

		setHex('g');	
		
	}

	public HexToBinary(char hexNum)
	{
		
		setHex(hexNum);

	}

	public void setHex(char hexNum)
	{

		hex = hexNum;

	}

	public String getBinary()
	{
		if(hex == 'A') {
			return "1010";
		}else if (hex == 'B') {
			return "1011";
		}else if (hex == 'C') {
			return "1100";
		}else if (hex == 'D') {
			return "1101";
		}else if (hex == 'E') {
			return "1110";
		}else if (hex == 'F') {
			return "1111";
		}
		
		return "[REDACTED]";
	}

	public String toString()
	{
		return hex + " is " + getBinary() + " in binary";
	}
}