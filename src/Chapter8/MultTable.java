package Chapter8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
		setTable(num,end);
	}

	public void setTable(int num, int end)
	{
		number = num;
		stop = end;
	}

	public void printTable( )
	{
		System.out.println("Multiplication table for: " + number);
		for(int  x = 1; x <= stop;  x++) {
			System.out.println(x + "\t" + (x*number));
		}
	}
}