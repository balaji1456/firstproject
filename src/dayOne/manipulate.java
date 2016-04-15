package dayOne;

public class manipulate {
  //int num=1;
	
	public synchronized void  printer() {
		for (int i = 0; i < 100; i++) { 
			if (i==80)
				continue;
			System.out.print(i+",");
		}
	}
	public static void printaz() {
		for (char c = 'a'; c <='z'; c++) {
			System.out.print(c+",");
		}
	}
	public void variable() {
		String name="sunday";
		switch (name) {
		case "sunday":
			System.out.print("today is sunday");
		
			break;

		default:
			System.out.print("this does not match");
			break;
		}
	}
	public static void main(String[] args) {
		manipulate bala= new manipulate();
		bala.printer();
		manipulate.printaz();
		 
       bala.variable();
		
	}
	
	
	
	
} 
