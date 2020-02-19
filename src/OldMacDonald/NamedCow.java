package OldMacDonald;

public class NamedCow extends Cow{
	private String name;
	NamedCow(String n ){
		setName(n);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
