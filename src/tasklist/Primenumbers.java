package tasklist;

public class Primenumbers {
	
	public void num() {
		for (int i = 1; i <= 100; i++) {
			
			for (int j =0 ; j <i; j++) {
				System.out.print(i+j);
				
			}
			
		}
		
		
	}
public static void main(String[] args) {
	Primenumbers pm=new Primenumbers();
	pm.num();
	
}
}
