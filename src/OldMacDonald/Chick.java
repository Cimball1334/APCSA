package OldMacDonald;

public class Chick implements Animal{
private String myType = "Chick";
private String mySound = "Cluck";
private enum Sounds{
	CLUCK, CHEEP
}
private Sounds sounds = Sounds.CLUCK;
	
	Chick(){
		
		if((int)(Math.random() * 2)  == 0) {
			sounds = Sounds.CLUCK;
		}else {
			sounds = Sounds.CHEEP;
		}
		
		
	}
	
	@Override
	public String getSound() {
		
		return getMySound();
	}

	@Override
	public String getType() {
		
		return getMyType();
	}

	public String getMyType() {
		return myType;
	}

	public void setMyType(String myType) {
		this.myType = myType;
	}

	public String getMySound() {
		
		switch(sounds) {
		
		case CLUCK:
			return "Cluck";
		
		case CHEEP:
			return "Cheep";
		
		}
		
		if((Math.random() *10) % 2 == 0) {
			sounds = Sounds.CLUCK;
		}else {
			sounds = Sounds.CHEEP;
		}
		
		return mySound;
	}

	public void setMySound(String mySound) {
		this.mySound = mySound;
	}

}
