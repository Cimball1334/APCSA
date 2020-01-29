package Chapter16;

///© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
		ExpressionSolver test = new ExpressionSolver("");
		test.setExpression("3 + 5");
		System.out.println(test);

		test.setExpression("3 * 5");
	
		
		
		test.setExpression("3 - 5");
	
		
		test.setExpression("3 / 5");
		
		test.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		
		test.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");

		
	}
}