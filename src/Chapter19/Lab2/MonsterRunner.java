package Chapter19.Lab2;

//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MonsterRunner
{
   public static void main( String args[] )
   {
		Monsters zero = new Monsters();
		Monsters one = new Monsters(8);
		Monsters sue = new Monsters(9, 4);
		Monsters harry = new Monsters(1, 2, 3);
		out.println("\nzero Monster :: " + zero);		
		out.println("\none Monster :: " + one);
		out.println("\nsue Monster :: " + sue);
		out.println("\nharry Monster :: " + harry);

		out.println("\nchanging harry's properties ");				
		harry.setHeight(7);
		harry.setWeight(6);
		harry.setAge(5);
		out.println("\nharry Monster :: " + harry);

		out.println("\ncloning harry");	
		sue = (Monsters)harry.clone();
		out.println("\nsue Monster :: " + sue);

		Monsters mOne = new Monsters(33,33,11);
		Monsters mTwo = new Monsters(55,33,11);

		out.println("\nMonster 1 :: " + mOne);
		out.println("\nMonster 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}