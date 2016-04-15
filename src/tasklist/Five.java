package tasklist;

public class Five {
	int temp;
	static int out=40;
	public void name() {
		for (int i = 1; i < 6; i++ ) {
			temp++;
			
			for (int j = 1; j <=temp ; j++) {
				
				System.out.print(j);
				
				
				
			}
			System.out.println();
			
		}
		
		
	}
public static void main(String[] args) {
	Five F=new Five();
	F.name();
	
	
}
}
