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

public class Monster
{
	//add stuff like instance variables, constructors, and methods.
	private static int age;
	private static int hight;
	private static int weight;
	
	public Monster(int a, int h, int w) {
		setAge(a);
		setHight(h);
		setWeight(w);
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Monster.age = age;
	}

	public static int getHight() {
		return hight;
	}

	public static void setHight(int hight) {
		Monster.hight = hight;
	}

	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		Monster.weight = weight;
	}
	
	public String toString()
    {
    	return "" + age + " " + hight + " " + weight;
    }
	
}