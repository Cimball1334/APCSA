package Chapter19.Lab6;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	private int numerator;
	private int denominator;

	// write two constructors
	public Rational() {
		setRational(1, 1);
	}

	public Rational(int n, int d) {
		setRational(n, d);
	}

	// write a setRational method
	public void setRational(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}

	// write a set method for numerator and denominator
	public void setNumerator(int n) {
		numerator = n;
	}

	public void setDenominator(int d) {
		denominator = d;
	}

	public void add(Rational other) {

		numerator = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
		denominator = denominator * other.getDenominator();
		reduce();
	}

	private void reduce() {
//System.out.println("Num and den: " + numerator + " " + denominator );
		int gcd = gcd(numerator, denominator);
		int num = numerator / gcd;
		int den = denominator / gcd;
		
		numerator = num;
		denominator = den;
	}

	private int gcd(int numOne, int numTwo) {
		int gcd = 1;
		if (numOne < numTwo) {

			for (int i = 1; i <=  numOne; i++) {

				if (numOne % i == 0 && numTwo % i == 0) {
					gcd = i;
				}

			}

		} else {

			for (int i = 1; i <= numTwo; i++) {

				if (numOne % i == 0 && numTwo % i == 0) {
					gcd = i;
				}

			}

		}
		return gcd;
	}

	public Object clone() {
		Rational dog = new Rational();
		return dog;
	}

	// ACCESSORS
	// write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public boolean equals(Object obj) {
		Rational other = (Rational) obj;
		double co = (double)other.getNumerator()/other.getDenominator();
		double local = (double)getNumerator()/getDenominator();
		if(local == co)
			return true;
		return false;
		
	}

	public int compareTo(Rational other) {
		double co = (double)other.getNumerator()/other.getDenominator();
		double local = (double)getNumerator()/getDenominator();
		if(local>co)
			return 1;
		
		return -1;
	}

	// write toString() method
	public String toString() {
		return numerator + " / " + denominator;
	}
}