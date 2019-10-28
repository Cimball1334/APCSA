package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		StringRemover test = new StringRemover();	
		
		test.setRemover("xR-MxR-MHelloxR-M" , "xR-M");
		System.out.println(test);
		
		test.setRemover("ssssssssxssssesssssesss" , "xs");
		System.out.println(test);
		
		test.setRemover("fuqwertyqwertyqwertyqwertyqwertyn" , "qwerty");
		System.out.println(test);
		
		
	}
}