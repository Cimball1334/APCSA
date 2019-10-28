package Chapter9;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class TenToAny
{
   private int base10;
   private int newBase;

   public TenToAny() {
   
   }
   public TenToAny(int num, int base) {
	setNums(num,base);
   }
   public void setNums(int num, int base) {
	   base10 = num;
	   newBase = base;
   }
   
	public String getNewNum()
	{
		String newNum="", reverse = "";
		String addition;
		
		while( base10 >0 ){
		 
		addition  = base10 % newBase + "";
		base10 /= newBase;
			
		if( Integer.parseInt(addition) >= 10) {
			switch(addition) {
			
			case "10":
				addition = "A";
				break;
			case "11":
				addition = "B";
				break;
			case "12":
				addition = "C";
				break;
			case "13":
				addition = "D";
				break;
			case "14":
				addition = "E";
				break;
			case "15":
				addition = "F";
				break;
				}
			}
		
		reverse += addition;
		
		}
		
		
		for(int i =0; i < reverse.length(); i++) {
			newNum = newNum + reverse.charAt(reverse.length()- 1 - i); 
		}
		
		
		return newNum;
	}

	//add a toString method	
	public String toString() {
		return base10 + " base 10 is " + getNewNum() + " in base " + newBase ;
	}
}