package OldMacDonald;

import java.util.ArrayList;

public class Farm {

	private ArrayList<Animal> myFarm = new ArrayList<Animal>();

	public Farm() {
		myFarm.add(new Cow());
		myFarm.add(new Chick());
		myFarm.add(new Pig());
		myFarm.add(new NamedCow("Your Mom"));
	}

	public String animalSounds() {
		String out = new String("");
		for (Animal a : myFarm) {
			out += a.getType() + " goes " + a.getSound() + "\n";
			
		}
		NamedCow named = (NamedCow)myFarm.get(3);
		out += named.getName();
		return out;
		
	}

	public String toString() {
		return animalSounds();
	}
	
	public ArrayList<Animal> getMyFarm() {
		return myFarm;
	}

	public void setMyFarm(ArrayList<Animal> myFarm) {
		this.myFarm = myFarm;
	}

}
