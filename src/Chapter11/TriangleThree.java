package Chapter11;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class TriangleThree {
	private int size;
	private String letter;

	public TriangleThree() {
	}

	public TriangleThree(int count, String let) {
		setTriangle(let, count);
	}

	public void setTriangle(String let, int sz) {
		size = sz;
		letter = let;
	}

	public String getLetter() {
		return letter;
	}

	public String toString() {
		String output = "";

		for (int a = 0; a < size; a++) {

			for (int b = 0; b <= a; b++) {
				// System.out.print(let);
				output += this.getLetter();
			}
			// System.out.println();
			output += "\n";
		}



		return output + "\n";
	}
}