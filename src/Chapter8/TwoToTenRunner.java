package Chapter8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TwoToTenRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
	TwoToTen test = new TwoToTen();
	
	test.setTwo("1010");
	System.out.println(test);
	
	test.setTwo("1100");
	System.out.println(test);
	
	test.setTwo("1110");
	System.out.println(test);
	
	test.setTwo("1111");
	System.out.println(test);
	
	test.setTwo("11111");
	System.out.println(test);
	
	test.setTwo("111111");
	System.out.println(test);
	
	test.setTwo("1110101");
	System.out.println(test);
	
	test.setTwo("10101010101");
	System.out.println(test);
	
	test.setTwo("1010101010110");
	System.out.println(test);
	
	test.setTwo("111111111111111111");
	System.out.println(test);
	}
}