//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;

class PassCheck
{
	private String password;

	public PassCheck()
	{
	}

	public PassCheck(String pass)
	{
	    setPass(pass);
	    
	   }
	   
	public void setPass(String pass)
	{
	    password = pass;
	   }
	   
	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		
		boolean runner = true;
		
		do{
		    System.out.println("Enter a password :: ");
		    if(keyboard.nextLine().equals(password))
		    {
		       System.out.println("Valid"); 
		       runner = false;
		      } else
		      {
		          System.out.println("Invalid");
		      }
		  }while(runner);
	}
	
	 
}