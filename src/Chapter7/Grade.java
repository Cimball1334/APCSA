package Chapter7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Grade
{
	private int numGrade;

	public Grade()
	{
	}

	public Grade(int grade)
	{
		setGrade(grade);
	}

	public void setGrade(int grade)
	{
		numGrade = grade;
	}

	public String getLetterGrade( )
	{	String letGrade = "";
	
	
		if(numGrade >= 90) {
			letGrade="A";
		}else if (numGrade < 90 && numGrade >=80) {	
			letGrade = "B";
		}else if (numGrade < 80 && numGrade >=75) {	
			letGrade = "C";
		}else if (numGrade < 75 && numGrade >=70) {	
			letGrade = "D";
		}else if (numGrade < 70) {	
			letGrade = "F";
		}
		return letGrade;
	}

	public String toString()
	{
		return numGrade + " is a " + getLetterGrade() + "\n";
	}
}