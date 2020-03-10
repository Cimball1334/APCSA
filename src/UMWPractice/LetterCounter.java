package UMWPractice;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class LetterCounter {

	public static void main(String args[]) {
		char c;
		int num;
	
		Scanner file = new Scanner(System.in);
		String temp = file.nextLine();
		c = temp.charAt(0);
		num = file.nextInt();
		temp = file.nextLine();
		ArrayList<String> list = new ArrayList<String>(num);
		for(int i = 0; i < num; i++) {
			list.add(file.nextLine());
		}
		
		
		for(String str : list) {
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				
				if(str.charAt(i) == c) {
					count++;
				}
				
			}
			System.out.println(count);
		}
		
		
	}
	
}
