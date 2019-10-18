package Chapter8;


public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats();
		
		test.setNums(1,5);
		test.getTotal();
		System.out.println(test);
		
		test.setNums(2,8);
		test.getTotal();
		System.out.println(test);
		
		test.setNums(5,15);
		test.getTotal();
		System.out.println(test);
		
	}
}