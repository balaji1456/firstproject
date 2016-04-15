package dayOne;

public class Eliminating {
	String greeting = "hi how are you";
	public void continu() {
		for (int i = 0; i < greeting.length(); i++) {
			char cc= greeting.charAt(i);
			if (cc=='h') {
				continue;
				
			}
			System.out.print(greeting.charAt(i));
			
		}
		
		
		
	}
	public static void main(String[] args) {
		Eliminating elm= new Eliminating();
		elm.continu();
	}

}
