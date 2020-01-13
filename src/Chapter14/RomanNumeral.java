package Chapter14;

public class RomanNumeral {
	private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private final static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private Integer number;
	private String roman;

	public RomanNumeral(String str) {
		setRoman(str);
	}

	public RomanNumeral(Integer orig) {
		setNumber(orig);
	}

	public void setRoman(String rom) {
		roman = rom;
	}

	public Integer getNumber() {
		int counter = 0;
		String palce = roman;
		int sum = 0;
		for (String letter : LETTERS) {

			if (palce.indexOf(letter) == 0) {

				while (palce.indexOf(letter) != -1) {

					sum += NUMBERS[counter];
					palce = palce.substring(palce.indexOf(letter) + letter.length());
				}
			}
			counter++;
		}
		return sum;
	}

	public void setNumber(Integer num) {

		number = num;

	}

	public String toString() {
		String roman = "";
		int counter = 0;

		for (int num : NUMBERS) {

			while (number >= num) {
				roman += LETTERS[counter];
				number -= num;

			}
			counter++;

		}
		return roman;
	}
}