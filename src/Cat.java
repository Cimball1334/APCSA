
public class Cat {

	private String name;
	public int lives;
	
	public Cat() {
		
	}
	public Cat(String name) {
		//decleration of name data type : String
		setName(name);
		
	}
	public Cat(String name, int lives) {
		//decleration of name data type : String
		setName(name);
		lives = lives;
		
	}
	//getter and setter methods for initilization of static class and unstatic deferables.
	
	//*************
	
	public void setName(String names) {
		name = names;
	}
	public String getName() {
		return name;
	}
	
}
