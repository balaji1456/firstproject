package dayOne;

public class Even {
	
	public void enumb() {
		for (int i = 1; i < 100; i=i+2) {
			System.out.print(i+",");
			
		}
		
	}
	public static void main(String[] args) {
		
	
	Even ev= new Even();
	ev.enumb();
	}
}
