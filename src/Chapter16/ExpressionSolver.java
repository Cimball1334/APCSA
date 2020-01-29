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

public class ExpressionSolver {
	// add in instance variables
	private static String ex = new String();

	public ExpressionSolver(String s) {
		setExpression(s);
	}

	public void setExpression(String s) {
		ex = s;
	}

	public void solveExpression() {
		while (ex.indexOf("*") > -1 || ex.indexOf("/") > -1) {

			if (ex.indexOf("*") < ex.indexOf("/")) {
				int o1 = ex.charAt(ex.indexOf("*") - 2);
				int o2 = ex.charAt(ex.indexOf("*") + 2);
				int res = o1 * o2;
				String sRes = new String(Integer.toString(res));
				ex = ex.substring(0, o1) + sRes + ex.substring(o2+1);

			} else {

				int o1 = ex.charAt(ex.indexOf("/") - 2);
				int o2 = ex.charAt(ex.indexOf("/") + 2);
				int res = o1 / o2;
				String sRes = new String(Integer.toString(res));
				ex = ex.substring(0, o1) + sRes + ex.substring(o2+1);

			}

		}
		while (ex.indexOf("+") > -1 || ex.indexOf("-") > -1) {

			if (ex.indexOf("+") < ex.indexOf("-")) {
				int o1 = ex.charAt(ex.indexOf("+") - 2);
				int o2 = ex.charAt(ex.indexOf("+") + 2);
				int res = o1 + o2;
				String sRes = new String(Integer.toString(res));
				ex = ex.substring(0, o1) + sRes + ex.substring(o2+1);

			} else {

				int o1 = ex.charAt(ex.indexOf("-") - 2);
				int o2 = ex.charAt(ex.indexOf("-") + 2);
				int res = o1 - o2;
				String sRes = new String(Integer.toString(res));
				ex = ex.substring(0, o1) + sRes + ex.substring(o2+1);

			}

		}
	}

	public String toString() {
		solveExpression();
		return ex;
	}
}