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
	private int age;
	private int hight;
	private int weight;
	
	public Monster(int a, int h, int w) {
		setAge(a);
		setHight(h);
		setWeight(w);
	}

	public int getAge() {
		return age;
	}

	public  void setAge(int age) {
	this.age = age;
	}

	public  int getHight() {
		return hight;
	}

	public  void setHight(int hight) {
	this.hight = hight;
	}

	public  int getWeight() {
		return weight;
	}

	public  void setWeight(int weight) {
	this.weight = weight;
	}
	
	public String toString()
    {
    	return "" + age + " " + hight + " " + weight;
    }
	
}