package Chapter8;
public class VowelCounter
{
	public static String getNumberString( String s)
	{
		int fill = 0;
		for(int x = 0 ; x < s.length(); x++) {
			s=s.toLowerCase();
			if(		s.charAt(x) == 97 || 
					s.charAt(x)== 101 || 
					s.charAt(x)== 105 || 
					s.charAt(x)== 111 || 
					s.charAt(x)== 117 		) {	
				s = s.substring(0,x) + (fill) +  s.substring(x+1);
				fill++;
			}
			if(fill > 9) fill = 0;
		}
		return s;
	}
}


