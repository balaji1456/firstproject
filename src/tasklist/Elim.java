package tasklist;



public class Elim {
	public String hai="hi_how_are_you";
	public void hai()
	{
		for (int i=hai.length()-1;i>=0;i--) {
			char l=hai.charAt(i);
			if(l=='_'){
				continue;
			
			}
			System.out.print(l+" ");
			
		}
		
		
	}
	public static void main(String[] args) {
		Elim e=new Elim();
		e.hai();
		
	}

	}
