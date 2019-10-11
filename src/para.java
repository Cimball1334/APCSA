import java.util.Scanner;

public class para {
	public static String bob;
	public static void main (String arg[]) {
	
	//go through each letter, find first instance, take substring, if first insatnce greater than -1
		
	Scanner input = new Scanner(System.in);
		
	bob = input.nextLine();
	bob = bob.toLowerCase();
	if(findDoubleCharacter(bob)) System.out.println("True");
	
	}
	
	public static boolean findDoubleCharacter(String s) {
		for(int i = 97; i <= 123; i ++) {
			
			if(bob.indexOf( (char)(i) ) > 0){
				String temp = bob.substring(bob.indexOf((char)(i) + 1));
					if(temp.indexOf( (char)(i) )>0) {
						
					}else
					{
						return false;
					}
				
			}
			
		}
		
		return true;
	}
}
