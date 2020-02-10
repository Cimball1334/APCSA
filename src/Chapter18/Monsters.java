package Chapter18;

///A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];
	}

	public  void add(int spot, Monster m)
	{
		//put m in the Monster array at [spot]
		myMonsters[spot] = m;
		
	}

	public Monster getOldest( )
	{
		int oldest = 0;
		Monster name = null;
		for(Monster d: myMonsters) {
		 if(d.getAge() > oldest) {
			 oldest = d.getAge();
			 name = d;
		 }
		}
		return name;
	}

	public Monster getTallest( )
	{
		int oldest = 0;
		Monster name = null;
		for(Monster d: myMonsters) {
		 if(d.getHight() > oldest) {
			 oldest = d.getHight();
			 name = d;
		 }
		}
		return name;
	}
   
   public Monster getSlimmest( )
	{
	   int oldest = myMonsters[0].getWeight();
		Monster name = myMonsters[0];
		for(Monster d: myMonsters) {
		 if(d.getWeight() < oldest) {
			 oldest = d.getWeight();
			 name = d;
		 }
		}
		return name;
	}

	public String toString()
	{
		return "" + Arrays.toString(myMonsters);
	}
}