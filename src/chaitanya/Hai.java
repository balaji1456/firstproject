package chaitanya;

public class Hai {
	int three;
	int four;
	String text="343333434343434343434444443434343434343434344344444343434343";
	public void seperate() {
		for (int i = 0; i < text.length(); i++) {
			char tf=text.charAt(i);
			
			switch (tf) {
			case '3':
				    three++;
				
				
				
				break;
			case '4':
				four++;
			break;
			

			
			}
			

	}
		System.out.println(four+",,"+three);
	}
public static void main(String[] args){
	Hai hai1=new Hai();
	hai1.seperate();
}	
}
