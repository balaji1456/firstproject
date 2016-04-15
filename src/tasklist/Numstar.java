package tasklist;

public class Numstar {
	  static int temp;
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			temp++;
			System.out.print(i+" ");
			for (int j =1 ; j <=temp; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
