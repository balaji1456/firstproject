package tasklist;

public class Incdec {
	static int temp;
	static int ment=5;
	public static void main(String[] args) {
		
	
		for (int i = 1; i <=5 ; i++) {
			temp++;
			System.out.print(i+"");
			for (int j =1 ; j <= temp; j++) {
				System.out.print('*');
				
			}
			System.out.println();
			
				
			
		}	
			
		
		for (int k = 4; k >=1; k--) {
			ment--;
			System.out.print(k+" ");
			for (int l = 1; l <=k; ) {
				System.out.print('*');
			}
			System.out.println();	
				
			}
		
			
		}
		
	}
	


