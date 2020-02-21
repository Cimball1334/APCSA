package UMWPractice;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PetalTimer {
	
	public static void main(String args[]) throws IOException {
		
	Scanner file = new Scanner(new File("PetalData.dat"));
	int a = file.nextInt();
	int b = file.nextInt();
	System.out.println("The beast has " + a*b + " days to find true love!");
	
	}
}