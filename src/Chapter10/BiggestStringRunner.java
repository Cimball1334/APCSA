//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

public class BiggestStringRunner
{
	public static void main(String args[])
	{
		BiggestString test = new BiggestString();
		
		test.setStrings("abc","cba","bca");
		System.out.println(test);
		
		test.setStrings("one","fourteen","twenty");
		System.out.println(test);
		
		test.setStrings("124323","20009","3434");
		System.out.println(test);
		
		test.setStrings("abcde","ABCDE","1234234324");
		System.out.println(test);

	}
}