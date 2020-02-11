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

import java.lang.reflect.Array;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];
		System.out.println(myMonsters.length);
	}

	public  void add(int spot, Monster m)
	{
		//put m in the Monster array at [spot]
		Array.set(myMonsters, spot, m);
//		myMonsters[spot] = m;
		System.out.println(Arrays.toString(myMonsters));
	}

	public Monster getOldest( )
	{
		int oldest = 0;
		Monster name = null;
		for(Monster d: myMonsters) {
		 if(Monster.getAge() > oldest) {
			 oldest = Monster.getAge();
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
		 if(Monster.getHight() > oldest) {
			 oldest = Monster.getHight();
			 name = d;
		 }
		}
		return name;
	}
   
   public Monster getSlimmest( )
	{
	   int oldest = Monster.getWeight();
		Monster name = myMonsters[0];
		for(Monster d: myMonsters) {
		 if(Monster.getWeight() < oldest) {
			 oldest = Monster.getWeight();
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