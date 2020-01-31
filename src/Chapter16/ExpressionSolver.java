package Chapter16;

///© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver {
	// add in instance variables
	private static String ex = new String();
	private static ArrayList<String> al = null;

	public ExpressionSolver(String s) {
		setExpression(s);
	}

	public void setExpression(String s) {
		ex = s;
		ex = s.replace(" ", "");
		al = new ArrayList<String>(Arrays.asList(ex.split("")));

	}

	public void solveExpression() {
		while (al.indexOf("*") > -1 || al.indexOf("/") > -1) {
			if (al.indexOf("/") == -1) {
				int loc = al.indexOf("*");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 * o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();

			} else if (al.indexOf("*") == -1) {

				int loc = al.indexOf("/");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 / o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();

			} else if (al.indexOf("*") < al.indexOf("/")) {
				int loc = al.indexOf("*");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 * o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();
			} else {

				int loc = al.indexOf("/");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 / o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();
			}

		}

		while (al.indexOf("+") > -1 || al.indexOf("-") > -1) {

			if (al.indexOf("-") == -1) {

				int loc = al.indexOf("+");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 + o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();
			} else if (al.indexOf("+") == -1) {

				int loc = al.indexOf("-");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 - o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();

			} else if (al.indexOf("+") < al.indexOf("-")) {
				int loc = al.indexOf("+");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 + o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();

			} else {
				int loc = al.indexOf("-");
				int o1 = Integer.parseInt(al.get(loc - 1));
				int o2 = Integer.parseInt(al.get(loc + 1));
				int res = o1 - o2;
				String sRes = Integer.toString(res);
				al.set(loc + 1, sRes);
				al.remove(loc - 1);
				al.remove(loc - 1);
				ex = al.toString();

			}

		}
	}

	public String toString() {
		solveExpression();
		return ex;
	}
}