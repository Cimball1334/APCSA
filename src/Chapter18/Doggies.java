package Chapter18;

///A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void add(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int oldest = 0;
		String name = null;
		for(Dog d: pups) {
		 if(d.getAge() > oldest) {
			 oldest = d.getAge();
			 name = d.getName();
		 }
		}
		return name;
	}

	public String getNameOfYoungest()
	{
		int youngest = pups[0].getAge();
		String name = pups[0].getName();
		for(Dog d: pups) {
		 if(d.getAge() < youngest) {
			 youngest = d.getAge();
			 name = d.getName();
		 }
		}
		return name;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}