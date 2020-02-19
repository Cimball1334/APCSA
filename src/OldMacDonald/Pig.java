package OldMacDonald;

public class Pig implements Animal{
private String myType = "Pig";
private String mySound = "Oink";;
	
	Pig(){
		
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
		return mySound;
	}

	public void setMySound(String mySound) {
		this.mySound = mySound;
	}

}
