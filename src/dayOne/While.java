package dayOne;

public class While {
   public static void main(String[] args) {
	 int loop=0;
	 while (true) {
		   System.out.println("looping:"+loop);
		if (loop==5) {
			System.out.println("from if block");
		   break;	
		}
		loop++;
		System.out.println("running");
	}
}
}
