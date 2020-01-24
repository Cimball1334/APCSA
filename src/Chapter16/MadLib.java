package Chapter16;

///© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib {
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;

	public MadLib() {

	}

	public MadLib(String fileName) {
		// load stuff
		loadVerbs();
		loadNouns();
		loadAdjectives();
		try {
			Scanner file = new Scanner(new File(fileName));
			
			// # are nouns
			// @ verb
			// & adjectives
			while(file.hasNext()) {
				String st = new String(file.nextLine());
				st.replace("#", getRandomNoun());
				st.replace("@", getRandomVerb());
				st.replace("&", getRandomAdjective());
				System.out.println(st);
			}
			

		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}

	}

	public void loadNouns() {
		try {
			Scanner file = new Scanner(new File("nouns.dat"));
			nouns = new ArrayList<String>();

			while (file.hasNext()) {
				nouns.add(file.nextLine());
			}

		} catch (Exception e) {
		}

	}

	public void loadVerbs() {
		try {
			Scanner file = new Scanner(new File("verbs.dat"));
			verbs = new ArrayList<String>();

			while (file.hasNext()) {
				verbs.add(file.nextLine());
			}

		} catch (Exception e) {
		}
	}

	public void loadAdjectives() {
		try {
			Scanner file = new Scanner(new File("adjectives.dat"));
			adjectives = new ArrayList<String>();

			while (file.hasNext()) {
				adjectives.add(file.nextLine());
			}

		} catch (Exception e) {
		}
	}

	public String getRandomVerb() {
		int i = (int) (Math.random() * verbs.size());

		return verbs.get(i);
	}

	public String getRandomNoun() {
		int i = (int) (Math.random() * nouns.size());

		return nouns.get(i);
	}

	public String getRandomAdjective() {
		int i = (int) (Math.random() * adjectives.size());

		return adjectives.get(i);
	}

	public String toString() {
		
		return "";
	}
}