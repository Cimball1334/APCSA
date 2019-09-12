import java.util.ArrayList;
import java.util.Arrays;

public class Alphabetical {
	static String  sentence = "i like dogs";	
	static ArrayList<String> words = new ArrayList<String>();
	
	public static void main(String args[]) {
	findSpace(sentence);
	 String[] word = words.toArray(new String[words.size()]);
	 print(word);
     
	
	}
	
	private static void print(String[] words) {
		
		System.out.println(Arrays.toString(words));
		Arrays.sort(words);
		
		for(int i = 0; i < words.length; i++)
	            System.out.println(words[i]);
		
	}

	public static void findSpace(String s) {
		for(int i = 0; i < s.length(); i++) {
			if((int)(s.charAt(i)) == 32){ 
				newWord(i);
				break;
			}else {
				
			}
			if(i >= s.length()-1 && (int)(s.charAt(i)) != 32) {
				words.add(sentence);
				break;	
			}
		}
	
	}

	public static void newWord(int i) {
		words.add(sentence.substring(0, i));
		
		sentence = sentence.substring(i +1, sentence.length());
		

		findSpace(sentence);
	}
	
}
