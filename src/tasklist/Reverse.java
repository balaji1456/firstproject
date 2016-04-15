package tasklist;



public class Reverse {
	String text="this is a scentence";
	String str[]=text.split(" ");
	public void scentence() {
		for (int i = str.length-1; i >= 0; i--) {
			
			System.out.print(str[i]);
		}
		
		
	}
		
		
			
		
	public static void main(String[] args) {
		Reverse RE=new Reverse();
		RE.scentence();
	}
		
		
	}


